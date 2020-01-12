/**
 * Minified debouncer
 * 
 * @param  {Function} a     The function to be debounced.
 * @param  {Number} b       How much time to wait before executing (in ms).
 * @param  {Object} c       Context in which to call func() (default is this).
 * @return {Function}
 */
/* eslint-disable */
export function debounce(a,b,c){var d,e;return function(){function h(){d=null,c||(e=a.apply(f,g))}var f=this,g=arguments;return clearTimeout(d),d=setTimeout(h,b),c&&!d&&(e=a.apply(f,g)),e}}
/* eslint-enable */
