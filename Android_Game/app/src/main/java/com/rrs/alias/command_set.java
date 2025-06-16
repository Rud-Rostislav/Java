package com.rrs.alias;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;

public class command_set extends AppCompatActivity {

    // список з іменами команд
    static ArrayList<String> command_names = new ArrayList<>(Arrays.asList(
            "ЗСУ", "СБУ", "Поліція", "ТРО", "Азов", "Льотчики", "Цигани", "Кіборги", "Патріоти",
            "Волонтери", "із України", "Хитрі", "Сміливі", "Айтішніки", "Дєрзкі", "Суєтологи",
            "Рішали", "Бандіти", "Хулігани", "Безсмертні", "Тугодуми"
    ));

    // перебор назв команд без дублікатів
    int command_1_counter = 0, command_2_counter = 1, command_3_counter, command_4_counter;

    // передача назви команд до гри
    static String command_1, command_2, command_3 = "", command_4 = "";

    // встановлення звуку
    static int sound_set_counter = 1;

    // очки
    static int counter_score = 0;
    static int[] score_to_win_array = {10, 20, 30, 40, 50, 60};
    static int score_to_win;

    //таймер
    static int counter_time = 0;
    static int[] time_to_win_array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
    static int time_to_win;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_set);

        //Команда 1
        Button command_button_1 = findViewById(R.id.command_1_set); // шукаємо кнопку
        command_1 = command_names.get(command_1_counter); // без дублікатів
        command_button_1.setText(command_1); // встановлюємо кнопкі текст

        //Команда 2
        Button command_button_2 = findViewById(R.id.command_2_set); // шукаємо кнопку
        command_2 = command_names.get(command_2_counter); // без дублікатів
        command_button_2.setText(command_2); // встановлюємо кнопкі текст

        // Кнопка видалення 3 і 4 команди
        Button delete_command_3 = findViewById(R.id.delete_command_3);
        Button delete_command_4 = findViewById(R.id.delete_command_4);

        // поява додавання 3 і 4 команди
        Button plus_command_4 = findViewById(R.id.plus_command_4);
        Button plus_command_3 = findViewById(R.id.plus_command_3);

        // Команда 3 і 4
        Button command_button_3 = findViewById(R.id.command_3_set); // шукаємо кнопку
        Button command_button_4 = findViewById(R.id.command_4_set); // шукаємо кнопку


        // додати команду 3
        plus_command_3.setOnClickListener(view -> {
            plus_command_3.setVisibility(View.INVISIBLE);
            command_button_3.setVisibility(View.VISIBLE);

            if (command_3_counter == command_names.size() - 1) {
                command_3_counter = 0;
            } else {
                command_3_counter++;
            }
            // Без дублікатів
            while (command_3_counter == command_1_counter || command_3_counter == command_2_counter || command_3_counter == command_4_counter) {
                if (command_3_counter == command_names.size() - 1) {
                    command_3_counter = 0;
                } else {
                    command_3_counter++;
                }
            }

            command_3 = command_names.get(command_3_counter);
            command_button_3.setText(command_3);

            command_3 = command_names.get(command_3_counter); // без дублікатів
            command_button_3.setText(command_3); // встановлюємо кнопкі текст
            plus_command_4.setVisibility(View.VISIBLE);
            delete_command_3.setVisibility(View.VISIBLE);
        });

        // додати команду 4
        plus_command_4.setOnClickListener(view -> {
            delete_command_3.setVisibility(View.INVISIBLE);
            plus_command_4.setVisibility(View.INVISIBLE);
            command_button_4.setVisibility(View.VISIBLE);

            if (command_4_counter == command_names.size() - 1) {
                command_4_counter = 0;
            } else {
                command_4_counter++;
            }
            // Без дублікатів
            while (command_4_counter == command_1_counter || command_4_counter == command_2_counter || command_4_counter == command_3_counter) {
                if (command_4_counter == command_names.size() - 1) {
                    command_4_counter = 0;
                } else {
                    command_4_counter++;
                }
            }

            command_4 = command_names.get(command_4_counter); // без дублікатів
            command_button_4.setText(command_4); // встановлюємо кнопкі текст
            delete_command_4.setVisibility(View.VISIBLE);
        });

        // видалити 3 команду
        delete_command_3.setOnClickListener(view -> {
            delete_command_3.setVisibility(View.INVISIBLE);
            command_button_3.setVisibility(View.INVISIBLE);
            delete_command_3.setVisibility(View.INVISIBLE);
            plus_command_4.setVisibility(View.INVISIBLE);
            plus_command_3.setVisibility(View.VISIBLE);
            command_3 = "";
        });

        // видалити 4 команду
        delete_command_4.setOnClickListener(view -> {
            delete_command_4.setVisibility(View.INVISIBLE);
            command_button_4.setVisibility(View.INVISIBLE);
            delete_command_3.setVisibility(View.VISIBLE);
            plus_command_4.setVisibility(View.VISIBLE);
            command_4 = "";
        });


        // установка 1 кнопки без дублікаів
        command_button_1.setOnClickListener(view -> {
            if (command_1_counter == command_names.size() - 1) {
                command_1_counter = 0;
            } else {
                command_1_counter++;
            }
            // Без дублікатів
            while (command_1_counter == command_2_counter || command_1_counter == command_3_counter || command_1_counter == command_4_counter) {
                if (command_1_counter == command_names.size() - 1) {
                    command_1_counter = 0;
                } else {
                    command_1_counter++;
                }
            }

            command_1 = command_names.get(command_1_counter);
            command_button_1.setText(command_1);
        });


        // установка 2 кнопки без дублікаів
        command_button_2.setOnClickListener(view -> {
            if (command_2_counter == command_names.size() - 1) {
                command_2_counter = 0;
            } else {
                command_2_counter++;
            }
            // Без дублікатів
            while (command_2_counter == command_1_counter || command_2_counter == command_3_counter || command_2_counter == command_4_counter) {
                if (command_2_counter == command_names.size() - 1) {
                    command_2_counter = 0;
                } else {
                    command_2_counter++;
                }
            }

            command_2 = command_names.get(command_2_counter);
            command_button_2.setText(command_2);
        });


        // установка 3 кнопки без дублікаів
        command_button_3.setOnClickListener(view -> {
            if (command_3_counter == command_names.size() - 1) {
                command_3_counter = 0;
            } else {
                command_3_counter++;
            }
            // Без дублікатів
            while (command_3_counter == command_1_counter || command_3_counter == command_2_counter || command_3_counter == command_4_counter) {
                if (command_3_counter == command_names.size() - 1) {
                    command_3_counter = 0;
                } else {
                    command_3_counter++;
                }
            }

            command_3 = command_names.get(command_3_counter);
            command_button_3.setText(command_3);
        });

        // установка 4 кнопки без дублікаів
        command_button_4.setOnClickListener(view -> {
            if (command_4_counter == command_names.size() - 1) {
                command_4_counter = 0;
            } else {
                command_4_counter++;
            }
            // Без дублікатів
            while (command_4_counter == command_1_counter || command_4_counter == command_2_counter || command_4_counter == command_3_counter) {
                if (command_4_counter == command_names.size() - 1) {
                    command_4_counter = 0;
                } else {
                    command_4_counter++;
                }
            }

            command_4 = command_names.get(command_4_counter);
            command_button_4.setText(command_4);
        });




        // установка звуку
        Button sound_set = findViewById(R.id.sound_set);
        sound_set.setOnClickListener(view -> {
            // звук з 1 на 0 - вимикаємо
            if (sound_set_counter == 1) {
                sound_set.setText("Звук вимкнено");
                sound_set_counter = 0;
            // звук з 0 на 1 - вмикаємо
            } else if(sound_set_counter == 0) {
                sound_set.setText("Звук увімкнено");
                sound_set_counter++;
            }
        });


        // установка очків
        Button score_set = findViewById(R.id.score_set); // кнопка очок
        TextView score_set_hint = findViewById(R.id.score_set_hint); // текст очок
        score_set_hint.setText(Integer.toString(score_to_win_array[counter_score]));
        score_to_win = score_to_win_array[counter_score];

        score_set.setOnClickListener(view -> {
            if(counter_score < (score_to_win_array).length - 1) {
                counter_score++;
            } else {
                counter_score = 0;
            }
            score_set_hint.setText(Integer.toString(score_to_win_array[counter_score]));
            score_to_win = score_to_win_array[counter_score];
        });


        // установка таймера
        Button timer_set = findViewById(R.id.timer_set); // кнопка очок
        TextView timer_set_hint = findViewById(R.id.timer_set_hint); // текст очок
        timer_set_hint.setText(Integer.toString(time_to_win_array[counter_time]));
        time_to_win = time_to_win_array[counter_time];

        timer_set.setOnClickListener(view -> {
            if(counter_time < time_to_win_array.length - 1) {
                counter_time++;
            } else {
                counter_time = 0;
            }
            timer_set_hint.setText(Integer.toString(time_to_win_array[counter_time]));
            time_to_win = time_to_win_array[counter_time];
        });

    }

    // переход на головну
    public void to_main(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // переход до гри
    public void to_game(View v) {
        Intent intent = new Intent(this, game.class);
        startActivity(intent);
    }

}