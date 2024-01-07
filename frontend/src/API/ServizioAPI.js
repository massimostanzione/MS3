export class ServizioAPI {
    constructor() {
    }

//TODO deprecare?
  async getService() {
    try {
      const response = await fetch('/medical-services/');

      if (!response.ok) {
        throw new Error('Failed to fetch data');
      }

      const body = await response.json();
      const servizi = body.map(item => item.name);
      return servizi;
    } catch (error) {
      console.error('Error fetching data:', error.message);
      return [];
    }
  }

    async getAllServices() {
        const response = await fetch('/api/medical-services/');
        const body = await response.json();

        const services = [];

        for (let i = 0; i < body.length; i++) {
            const service = {};
            service.name = body[i].nome;
            var taskTypesList = body[i].mansioni;
            service.taskTypesList = "";
            for (let j = 0; j < taskTypesList.length; j++) {
                service.taskTypesList = service.taskTypesList.concat(taskTypesList[j].taskType, " ");
            }
            services[i] = service;
        }
        return services;
    }

    async getAvailableTaskTypes() {
        const response = await fetch('/api/medical-services/available-task-types');
        const body = await response.json();
        return body;
    }

  async createMedicalService(params) {
    const requestOptions = {
      method: 'POST',
      headers: {'Content-Type': 'application/json'},
      body: JSON.stringify(params)
    };

    const response = await fetch('/api/medical-services/', requestOptions);
    return response;
  }
}
