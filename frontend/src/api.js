import axios from 'axios';


const api = axios.create({
  baseURL: import.meta.env.VITE_API_URL || 'http://localhost:8080/api',
});

export const listarProyectos = () => api.get('/proyectos');
export const listarDestacados = () => api.get('/proyectos/destacados');
export const obtenerProyecto = (id) => api.get(`/proyectos/${id}`);
export const crearProyecto = (datos) => api.post('/proyectos', datos);
export const actualizarProyecto = (id, datos) => api.put(`/proyectos/${id}`, datos);
export const eliminarProyecto = (id) => api.delete(`/proyectos/${id}`);

export const listarViviendas = () => api.get('/viviendas');
export const viviendasDelProyecto = (id) => api.get(`/proyectos/${id}/viviendas`);
export const crearVivienda = (datos) => api.post('/viviendas', datos);
export const actualizarVivienda = (id, datos) => api.put(`/viviendas/${id}`, datos);
export const eliminarVivienda = (id) => api.delete(`/viviendas/${id}`);

export const listarClientes = () => api.get('/clientes-interesados');
export const crearCliente = (datos) => api.post('/clientes-interesados', datos);
export const eliminarCliente = (id) => api.delete(`/clientes-interesados/${id}`);


