window.addEventListener('error',({target:element})=>{const githubRegex=/github\.com\/.*\.png.*/
const src=element.src;if(githubRegex.exec(src)){if(src.startsWith('https://')||src.startsWith('http://')||src.startsWith('//')){const params=new URLSearchParams(src);element.src=params.get('d');return}
element.src='https://'+src}},!0)