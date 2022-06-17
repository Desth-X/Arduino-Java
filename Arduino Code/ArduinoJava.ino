void setup() {
  for (int i = 2; i <= 13; i++) {
    pinMode(i, OUTPUT);
  }
  Serial.begin(9600);
}

void loop() {
  if (Serial.available() > 0) {
    int input = Serial.read();
    if (input == '0') {
      digitalWrite(2, 0);
      digitalWrite(3, 0);
      digitalWrite(4, 0);
      digitalWrite(5, 0);
    }
    if (input == '1') {
      digitalWrite(2, 1);
      digitalWrite(3, 0);
      digitalWrite(4, 0);
      digitalWrite(5, 0);
    }
    if (input == '2') {
      digitalWrite(2, 0);
      digitalWrite(3, 1);
      digitalWrite(4, 0);
      digitalWrite(5, 0);
    }
    if (input == '3') {
      digitalWrite(2, 1);
      digitalWrite(3, 1);
      digitalWrite(4, 0);
      digitalWrite(5, 0);
    }
    if (input == '4') {
      digitalWrite(2, 0);
      digitalWrite(3, 0);
      digitalWrite(4, 1);
      digitalWrite(5, 0);
    }
    if (input == '5') {
      digitalWrite(2, 1);
      digitalWrite(3, 0);
      digitalWrite(4, 1);
      digitalWrite(5, 0);
    }
    if (input == '6') {
      digitalWrite(2, 0);
      digitalWrite(3, 1);
      digitalWrite(4, 1);
      digitalWrite(5, 0);
    }
    if (input == '7') {
      digitalWrite(2, 1);
      digitalWrite(3, 1);
      digitalWrite(4, 1);
      digitalWrite(5, 0);
    }
    if (input == '8') {
      digitalWrite(2, 0);
      digitalWrite(3, 0);
      digitalWrite(4, 0);
      digitalWrite(5, 1);
    }
    if (input == '9') {
      digitalWrite(2, 1);
      digitalWrite(3, 0);
      digitalWrite(4, 0);
      digitalWrite(5, 1);
    }
    if (input == 'A') {
      digitalWrite(2, 0);
      digitalWrite(3, 1);
      digitalWrite(4, 0);
      digitalWrite(5, 1);
    }
    if (input == 'B') {
      digitalWrite(2, 1);
      digitalWrite(3, 1);
      digitalWrite(4, 0);
      digitalWrite(5, 1);
    }
    if (input == 'C') {
      digitalWrite(2, 0);
      digitalWrite(3, 0);
      digitalWrite(4, 1);
      digitalWrite(5, 1);
    }
    if (input == 'D') {
      digitalWrite(2, 1);
      digitalWrite(3, 0);
      digitalWrite(4, 1);
      digitalWrite(5, 1);
    }
    if (input == 'E') {
      digitalWrite(2, 0);
      digitalWrite(3, 1);
      digitalWrite(4, 1);
      digitalWrite(5, 1);
    }
    if (input == 'F') {
      digitalWrite(2, 1);
      digitalWrite(3, 1);
      digitalWrite(4, 1);
      digitalWrite(5, 1);
    }
  }
}
