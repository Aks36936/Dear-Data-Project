
String[] dates = {"10/10", "11/10", "12/10", "13/10","14/10", "15/10", "16/10", "17/10"};
float[] calories = {2843, 2547, 3071, 2425, 2615, 2470, 2976, 2100};




void setup() {
  size(1000, 500);
  textFont(createFont("Arial", 16));
}

void draw() {
  background(18, 22, 32);

  fill(255);
  textSize(28);
  textAlign(LEFT);
  text("Daily Calories Burned", 60, 60);

  float chartBottom = 440;
  float chartHeight = 300;
  float barWidth = 100;
  float space = 10;
  
  for (int i = 0; i < calories.length; i++){
    
    float x = 40 + i * (barWidth + space);
    
    float barHeight = calories[i] / 10;
    
    float y = chartBottom - barHeight;
    
    fill(236);
    rect(x,y,barWidth,barHeight);
    
  }
  }
