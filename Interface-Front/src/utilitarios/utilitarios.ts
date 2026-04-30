import type { IAtributos } from "./interface.js";

const criarElemento = (tag: string , conteudo: string | 
    null = null, atributos: IAtributos = {}): HTMLElement => {
    const elemento = document.createElement(tag)
    elemento.textContent = conteudo;
    
}