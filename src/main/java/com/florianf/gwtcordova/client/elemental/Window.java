package com.florianf.gwtcordova.client.elemental;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface Window {
    
    int requestAnimationFrame(Object callback);
}