function getAges(s, d){
    if(d<0 || s<0){
      return null;
    }
    
    const y = (s+d)/2;
    const x = s - y
    
    if(x<0 || y<0){
      return null;
    }
    
    return [y, x];
};

console.log(getAges(15, 5));