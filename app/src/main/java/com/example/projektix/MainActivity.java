package com.example.projektix;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    //----------------------------------------------------------------------------------------------------------//

    // Declaring the variables

    ListView lv;
    int i;
    RadioGroup radioGroup;
    RadioButton radioButton;
    int radioOption, finalOption, generates;
    boolean checkBox2Status = false,
            checkBox3Status = false,
            checkBox4Status = false,
            checkBox5Status = false,
            checkBox6Status = false;
    ArrayList<Integer> usedGenerations = new ArrayList<>();


    //----------------------------------------------------------------------------------------------------------//

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        radioGroup = new RadioGroup(this);
        radioButton = findViewById(radioGroup.getCheckedRadioButtonId());

        Log.d("tag", "App launched...");
        /* FULL SCREEN:
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);*/

        setContentView(R.layout.activity_main);
    }

    //----------------------------------------------------------------------------------------------------------//


    // Method of "Go" button in start screen

    public void goButton(View view) {
        setContentView(R.layout.secondview);
    }

    // Method of "My tasks" button in start screen

    public void myTasks(View view) {
        setContentView(R.layout.listofdays);
        lv = findViewById(R.id.listview);
        lv.setAdapter(new ArrayAdapter<Task>(
                this,
                android.R.layout.simple_list_item_checked,
                TaskList.getInstance().Tasks));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SparseBooleanArray sparseBooleanArray = lv.getCheckedItemPositions();
                Log.d("tag", "Clicked Position := "+ i + " Value: "+sparseBooleanArray.get(i));
                if (sparseBooleanArray.get(i)) {
                    Toast.makeText(getApplicationContext(), "Good job!", Toast.LENGTH_SHORT).show();
                    generates--;
                }
            }
        });

    }


    //----------------------------------------------------------------------------------------------------------//


    // Methods of the back arrows

    public void backArrow1(View view) {
        setContentView(R.layout.activity_main);
    }
    public void backArrow2(View view) {
        myTasks(view);
    }

    //----------------------------------------------------------------------------------------------------------//

    // Method of "Generate" button in the view of questions

    // Set the view, dependable on the finalOption

    // Add the generated task on the list



    public void Generate(View v) {

        if (generates < 5) {
        switch (GenerateFinalOption()) {
            case 1:
                if (!usedGenerations.contains(1)) {
                    TaskList.getInstance().Tasks.add(new Task("Draw some art", 1, false));
                    usedGenerations.add(1);
                    setContentView(R.layout.guideview);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 2:
                if (!usedGenerations.contains(2)) {
                    TaskList.getInstance().Tasks.add(new Task("Meditate before bedtime", 2, false));
                    setContentView(R.layout.guideview2);
                    usedGenerations.add(2);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 3:
                if (!usedGenerations.contains(3)) {
                    TaskList.getInstance().Tasks.add(new Task("Try a new recipe!", 3, false));
                    setContentView(R.layout.guideview3);
                    usedGenerations.add(3);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 4:
                if (!usedGenerations.contains(4)) {
                    TaskList.getInstance().Tasks.add(new Task("Take care of your muscles and stretch!", 4, false));
                    setContentView(R.layout.guideview4);
                    usedGenerations.add(4);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 5:
                if (!usedGenerations.contains(5)) {
                    TaskList.getInstance().Tasks.add(new Task("Create a peaceful ambiance", 5, false));
                    setContentView(R.layout.guideview5);
                    usedGenerations.add(5);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 6:
                if (!usedGenerations.contains(6)) {
                    TaskList.getInstance().Tasks.add(new Task("Enjoy a good book", 6, false));
                    setContentView(R.layout.guideview6);
                    usedGenerations.add(6);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 7:
                if (!usedGenerations.contains(7)) {
                    TaskList.getInstance().Tasks.add(new Task("Go for a date", 7, false));
                    setContentView(R.layout.guideview7);
                    usedGenerations.add(7);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 8:
                if (!usedGenerations.contains(8)) {
                    TaskList.getInstance().Tasks.add(new Task("Run or walk for 30 minutes", 8, false));
                    setContentView(R.layout.guideview8);
                    usedGenerations.add(8);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 9:
                if (!usedGenerations.contains(9)) {
                    TaskList.getInstance().Tasks.add(new Task("Go birdwatching!", 9, false));
                    setContentView(R.layout.guideview9);
                    usedGenerations.add(9);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 10:
                if (!usedGenerations.contains(10)) {
                    TaskList.getInstance().Tasks.add(new Task("Visit a nearby park and enjoy nature", 10, false));
                    setContentView(R.layout.guideview10);
                    usedGenerations.add(10);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 11:
                if (!usedGenerations.contains(11)) {
                    TaskList.getInstance().Tasks.add(new Task("Try a yoga class today", 11, false));
                    setContentView(R.layout.guideview11);
                    usedGenerations.add(11);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 12:
                if (!usedGenerations.contains(12)) {
                    TaskList.getInstance().Tasks.add(new Task("Go for a 30 min run or walk", 12, false));
                    setContentView(R.layout.guideview12);
                    usedGenerations.add(12);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 13:
                if (!usedGenerations.contains(13)) {
                    TaskList.getInstance().Tasks.add(new Task("Buy tickets to an event", 13, false));
                    setContentView(R.layout.guideview13);
                    usedGenerations.add(13);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 14:
                if (!usedGenerations.contains(14)) {
                    TaskList.getInstance().Tasks.add(new Task("Try a new sport today", 14, false));
                    setContentView(R.layout.guideview14);
                    usedGenerations.add(14);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 15:
                if (!usedGenerations.contains(15)) {
                    TaskList.getInstance().Tasks.add(new Task("Book a massage or sauna", 15, false));
                    setContentView(R.layout.guideview15);
                    usedGenerations.add(15);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 16:
                if (!usedGenerations.contains(16)) {
                    TaskList.getInstance().Tasks.add(new Task("Put your favorite music and dance!", 16, false));
                    setContentView(R.layout.guideview16);
                    usedGenerations.add(16);
                    generates++;
                } else {
                    Generate(v);
                }
                break;
            case 17:
                if (!usedGenerations.contains(17)) {
                    TaskList.getInstance().Tasks.add(new Task("Go play frisbee golf!", 17, false));
                    setContentView(R.layout.guideview17);
                    usedGenerations.add(17);
                    generates++;
                } else {
                    Generate(v);
                }

                break;
        }


        // If no options are chosen:

        if (radioOption == 0 || (!checkBox2Status && !checkBox3Status && !checkBox4Status && !checkBox5Status && !checkBox6Status)) {
            Toast.makeText(this, "Choose the most fitting options first", Toast.LENGTH_SHORT).show();
        }

        // When 5 tasks have been generated:

    } else {
            Toast.makeText(this, "You have generated 5 tasks. Try doing some of them!", Toast.LENGTH_SHORT).show();
        }

    }


    //----------------------------------------------------------------------------------------------------------//

    // Try again -button in GuideView

    public void tryAgain(View v) {
        Generate(v);
    }
    //----------------------------------------------------------------------------------------------------------//


    // Method of phone's back button

    @Override
    public void onBackPressed() {
        final ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this
                .findViewById(android.R.id.content)).getChildAt(0);

        if (viewGroup == findViewById(R.id.listview) || viewGroup == findViewById(R.id.secondview)) {
        setContentView(R.layout.activity_main);
        } else if (viewGroup == findViewById(R.id.guideview)) {
            setContentView(R.layout.secondview);
        } else {
            super.onBackPressed();
        }
    }

    //----------------------------------------------------------------------------------------------------------//


    // Methods when RadioButtons are clicked, return the values from chosen RadioButtons


    public int checkButton1(View view) {
        radioOption = 1;
        return radioOption;
    }
    public int checkButton2(View view) {
        radioOption = 2;
        return radioOption;
    }
    public int checkButton3(View view) {
        radioOption = 3;
        return radioOption;
    }
    public int checkButton4(View view) {
        radioOption = 4;
        return radioOption;
    }

    //----------------------------------------------------------------------------------------------------------//

    // Change the status when Checkboxes are clicked

    public void checkBox2Checked(View v) {
        checkBox2Status = !checkBox2Status;
    }


    public void checkBox3Checked(View v) {
        checkBox3Status = !checkBox3Status;
    }


    public void checkBox4Checked(View v) {
        checkBox4Status = !checkBox4Status;
    }


    public void checkBox5Checked(View v) {
        checkBox5Status = !checkBox5Status;
    }


    public void checkBox6Checked(View view) {
        checkBox6Status = !checkBox6Status;
    }



    //----------------------------------------------------------------------------------------------------------//

    // Method to generate the right GuideView, just for you :)

    public int GenerateFinalOption() {
        if (radioOption == 1) {
            if (checkBox2Status || checkBox3Status || checkBox6Status || checkBox5Status) {
                //1-6
                finalOption = (int)(Math.random() * (6 - 1 + 1) + 1);
            } else if (checkBox4Status) {
                Toast.makeText(this, "There doesn't seem to be anything for you yet!", Toast.LENGTH_SHORT).show();
            }

        } else if (radioOption == 2) {
            if (!checkBox2Status) {
                //7-14
                finalOption = (int)(Math.random() * (14 - 7 + 1) + 7);
            } else {
                //1-14
                finalOption = (int)(Math.random() * (14 - 1 + 1) + 1);
            }

        } else if (radioOption == 3) {
            if (!checkBox2Status) {
                //7-18
                finalOption = (int)(Math.random() * (18 - 7 + 1) + 7);
            } else {
                //1-18
                finalOption = (int)(Math.random() * (18 - 1 + 1) + 1);
            }

        } else if (radioOption == 4) {
            if (!checkBox2Status) {
                //7-18
                finalOption = (int) (Math.random() * (18 - 7 + 1) + 7);
            } else {
                //1-18
                finalOption = (int)(Math.random() * (18 - 1 + 1) + 1);
            }
        }
        return finalOption;
    }

    //----------------------------------------------------------------------------------------------------------//


}