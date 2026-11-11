import { useEffect } from 'react';

export const useEfectosApple = () => {
  useEffect(() => {
    const observador = new IntersectionObserver(
      (entradas) => {
        entradas.forEach((entrada) => {
          if (entrada.isIntersecting) {
            entrada.target.classList.add('revelado');
          }
        });
      },
      {
        threshold: 0.1,
        rootMargin: "0px 0px -50px 0px"
      }
    );

    const elementos = document.querySelectorAll('.revelar');
    elementos.forEach((el) => observador.observe(el));

    return () => observador.disconnect();
  }, []); 
};