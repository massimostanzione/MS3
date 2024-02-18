import React from "react";
import { ToastContainer, toast } from "react-toastify";
import 'react-toastify/dist/ReactToastify.css';
import { ShiftChangeRequestAPI } from "../../API/ShiftChangeRequestAPI";
import { Button } from "@mui/material";
import { useTranslation } from 'react-i18next';
import {panic} from "../../components/common/Panic";

export default function ShiftChangeView() {
  const { t } = useTranslation();

  const [state, setState] = React.useState({
    turnChangeRequestsBySender: [],
    turnChangeRequestsToSender: []
  });

  const requestAPI = new ShiftChangeRequestAPI();

  React.useEffect(() => {
    fetchData();
    const intervalId = setInterval(() => fetchData(), 6000);
    return () => clearInterval(intervalId); // Cleanup on component unmount
  }, []);

  const handle = (requestId, response) => {
    try {

      requestAPI.answerRequest(requestId, response);
      toast.success(t("Request "+response), {
        position: "top-center",
        autoClose: 5000,
        hideProgressBar: false,
        closeOnClick: true,
        pauseOnHover: true,
        draggable: true,
        progress: undefined,
        theme: "colored",
      });
    } catch (err) {
      panic()
      return ;
    }
    fetchData();
  };

  const fetchData = async () => {
    try {
      const turnChangeRequestsBySender = await requestAPI.getTurnChangeRequestsByIdUser(localStorage.getItem("id"));
      const turnChangeRequestsToSender = await requestAPI.getTurnChangeRequestsToIdUser(localStorage.getItem("id"));
      setState({
        turnChangeRequestsBySender,
        turnChangeRequestsToSender
      });
    } catch (error) {
      console.error('Error fetching notifications:', error);
      panic()
    }
  };

  const renderTable = (requests, headerText,flag) => {
    const sortedRequests = requests.sort((a, b) => new Date(a.inizioDate) - new Date(b.inizioDate));

    const options = {
      timeZone: 'Europe/Berlin',
      weekday: 'long',
      day: "numeric",
      month: 'long',
      year: 'numeric',
      hour12: false,
      hour: 'numeric',
      minute: 'numeric',
    };

    return (
      <>
        <h2 className="h2-padding">{headerText}</h2>
        <table className="table" style={{ borderRadius: '8px' }}>
          <thead>
          <tr>
            <th>{t('Shift')}</th>
            <th>{t('Start Date and Time')}</th>
            <th>{t('End Date and Time')}</th>
            <th>{t('User')}</th>
            <th>{t('Actions')}</th>
          </tr>
          </thead>
          <tbody>
          {sortedRequests.map((request, index) => {
            const startDate = new Date(request.inizioDate);
            const endDate = new Date(request.fineDate);
            if(flag==0){
            return (
              <tr key={request.requestId}>
                <td>{request.turnDescription[t('en')]}</td>
                <td>{startDate.toLocaleString(navigator.language, options)}</td>
                <td>{endDate.toLocaleString(navigator.language, options)}</td>
                <td>{request.userDetails}</td>
                <td>
                  <Button variant="contained" color="primary" style={{ marginRight: '8px' }} onClick={() => handle(request.requestId, true)}>
                    {t('Accept')}
                  </Button>
                  <Button variant="contained" color="secondary" onClick={() => handle(request.requestId, false)}>
                    {t('Reject')}
                  </Button>
                </td>
              </tr>
            );
          }
          else{
          return (
                        <tr key={request.requestId}>
                          <td>{request.turnDescription[t('en')]}</td>
                          <td>{startDate.toLocaleString(navigator.language, options)}</td>
                          <td>{endDate.toLocaleString(navigator.language, options)}</td>
                          <td>{request.userDetails}</td>
                          <td></td>
                        </tr>
                      );

          }
          })}
          </tbody>
        </table>
      </>
    );
  };

  return (
    <div className="Table-page-container" style={{ padding: '20px' }}>
      <style>
        {`
          .h2-padding {
            margin-top: 20px;
            margin-bottom: 20px;
          }
        `}
      </style>

      {renderTable(state.turnChangeRequestsToSender, t('Requests Received'),0)}
      {renderTable(state.turnChangeRequestsBySender, t('Requests Sent'),1)}
      <div style={{ marginTop: 'auto' }}></div>
    </div>
  );
}
