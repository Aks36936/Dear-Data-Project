String[] dates = {
  "10/10", "11/10", "12/10", "13/10",
  "14/10", "15/10", "16/10"
};

// The column order for every row:
String[] activities = {
  "Walking", "Gym", "Running", "Cycling",
  "Tennis", "Swimming", "Resting"
};

int[][] calories = {
  // Walk  Gym  Run  Cycle Tennis Swim Rest
  { 355,   411,   0,    0,    0,    0, 1978 }, // 10/10
  { 569,     0,   0,    0,    0,    0, 1978 }, // 11/10
  { 518,   379, 196,    0,    0,    0, 1978 }, // 12/10
  { 447,     0,   0,    0,    0,    0, 1978 }, // 13/10
  { 310,     0,   0,  327,    0,    0, 1978 }, // 14/10
  { 296,     0,   0,    0,  196,    0, 1978 }, // 15/10
  { 426,     0,   0,    0,    0,  572, 1978 }  // 16/10
};
void setup() {
  size(1000, 900);
  textFont(createFont("Arial", 16));
}

void draw() {
  background(18, 22, 32);

  fill(255);
  textSize(28);
  textAlign(LEFT);
  text("Daily Calories Burned", 60, 60);

  int circle_dist = 20;
  int circle_size = 8;

  for (int i = 0; i < calories.length; i++) {
    float x = 100 + i * 130;
    float y = 120;

    fill(255);
    textSize(14);
    textAlign(CENTER);
    text(dates[i], x, 95);

    for (int j = 0; j < calories[i].length; j++) {
      int circles = calories[i][j] / 100;

    

      for (int k = 0; k < circles; k++) {
        circle(x, y, circle_size);
        y = y + circle_dist + circle_size;

        
      }
    }
  }
}
  
