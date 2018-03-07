void setup() {
 size(500,500);
 noFill();
 for(int i=500; i>20; i-=31) {
   if(i%2==0) {
  fill(255,255,255);
   }
   else {
   fill(255,0,0);  
   }
    ellipse(250,250,i,i);
   
 }
}