package com.example.calculator;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;


public class Time extends Fragment implements AdapterView.OnItemSelectedListener{
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot;
    private TextView bclear;
    private ImageButton bBackspace;
    public TextView unit, unit1;
    public EditText result, result1;
    public String a, b;
    public String up;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragmentslist, container, false);

        Spinner spinner = (Spinner) rootView.findViewById(R.id.Spinner);
        Spinner spinner1 = (Spinner) rootView.findViewById(R.id.Spinner1);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Time, android.R.layout.simple_spinner_item);

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        result = (EditText) rootView.findViewById(R.id.EditText);
        result.setShowSoftInputOnFocus(false);
        unit = (TextView) rootView.findViewById(R.id.Text);
        result1 = (EditText) rootView.findViewById(R.id.EditText1);
        result1.setShowSoftInputOnFocus(false);
        unit1 = (TextView) rootView.findViewById(R.id.Text1);
        b0 = (Button) rootView.findViewById(R.id.zero);
        b1 = (Button) rootView.findViewById(R.id.one);
        b2 = (Button) rootView.findViewById(R.id.two);
        b3 = (Button) rootView.findViewById(R.id.three);
        b4 = (Button) rootView.findViewById(R.id.four);
        b5 = (Button) rootView.findViewById(R.id.five);
        b6 = (Button) rootView.findViewById(R.id.six);
        b7 = (Button) rootView.findViewById(R.id.seven);
        b8 = (Button) rootView.findViewById(R.id.eight);
        b9 = (Button) rootView.findViewById(R.id.nine);
        bdot = (Button) rootView.findViewById(R.id.dot);
        bclear = (TextView) rootView.findViewById(R.id.TextView3);
        bBackspace = (ImageButton) rootView.findViewById(R.id.BackSpace);

        result.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                up="1";
                return false;
            }
        });
        result1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                up="2";
                return false;
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("0",result);
                    ans(result,result1);
                }else{
                    updateText("0",result1);
                    ans(result1,result);
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("1",result);
                    ans(result,result1);

                }else{
                    updateText("1",result1);
                    ans(result1,result);
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("2",result);
                    ans(result,result1);
                }else{
                    updateText("2",result1);
                    ans(result1,result);
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("3",result);
                    ans(result,result1);
                }else{
                    updateText("3",result1);
                    ans(result1,result);
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("4",result);
                    ans(result,result1);
                }else{
                    updateText("4",result1);
                    ans(result1,result);
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("5",result);
                    ans(result,result1);
                }else{
                    updateText("5",result1);
                    ans(result1,result);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("6",result);
                    ans(result,result1);
                }else{
                    updateText("6",result1);
                    ans(result1,result);
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("7",result);
                    ans(result,result1);
                }else{
                    updateText("7",result1);
                    ans(result1,result);
                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("8",result);
                    ans(result,result1);
                }else{
                    updateText("8",result1);
                    ans(result1,result);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("9",result);
                    ans(result,result1);
                }else{
                    updateText("9",result1);
                    ans(result1,result);
                }
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText(".",result);
                    ans(result,result1);
                }else{
                    updateText(".",result1);
                    ans(result1,result);
                }

            }
        });


        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                result1.setText("");
            }
        });

        bBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cursorPos = result.getSelectionStart();
                int texlen = result.getText().length();
                int cursorPos1 = result1.getSelectionStart();
                int texlen1 = result1.getText().length();
                if (texlen != 0 && cursorPos != 0) {
                    SpannableStringBuilder selection = (SpannableStringBuilder) result.getText();
                    selection.replace(cursorPos - 1, cursorPos, "");
                    result.setText(selection);
                    result.setSelection(cursorPos - 1);

                }
                if (texlen1 != 0 && cursorPos != 0) {
                    SpannableStringBuilder selection1 = (SpannableStringBuilder) result1.getText();
                    selection1.replace(cursorPos - 1, cursorPos, "");
                    result1.setText(selection1);
                    result1.setSelection(cursorPos - 1);
                }
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    a = "Milliseconds";
                    unit.setText("ms");
                    ans(result,result1);
                } else if (position == 1) {
                    a = "Seconds";
                    unit.setText("s");
                    ans(result,result1);
                } else if (position == 2) {
                    a = "Minutes";
                    unit.setText("min");
                    ans(result,result1);
                } else if (position == 3) {
                    a = "Hours";
                    unit.setText("h");
                    ans(result,result1);
                } else if (position == 4) {
                    a ="Days";
                    unit.setText("d");
                    ans(result,result1);

                } else if (position == 5) {
                    a = "Weeks";
                    unit.setText("wk");
                    ans(result,result1);

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    b = "Milliseconds";
                    unit1.setText("ms");
                    ans(result,result1);
                } else if (position == 1) {
                    b = "Seconds";
                    unit1.setText("s");
                    ans(result,result1);
                } else if (position == 2) {
                    b = "Minutes";
                    unit1.setText("min");
                    ans(result,result1);
                } else if (position == 3) {
                    b = "Hours";
                    unit1.setText("h");
                    ans(result,result1);
                } else if (position == 4) {
                    b ="Days";
                    unit1.setText("d");
                    ans(result,result1);

                } else if (position == 5) {
                    b = "Weeks";
                    unit1.setText("wk");
                    ans(result,result1);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return rootView;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //nothing
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //nothing
    }
    public void cont(String unit,EditText resultb){
        if(unit.endsWith(".0")){
            unit= unit.substring(0,unit.length()-2);
        }
        resultb.setText(unit);
    }


    public void ans(EditText resulta,EditText resultb) {
        String text = a + b;
        Log.v("MainActivity", a + b);
        switch (text) {

            case "MillisecondsSeconds":
                Double ans1 = Double.parseDouble(resulta.getText().toString());
                String cont1=String.valueOf(ans1/1000);
                cont(cont1,resultb);
                break;
            case "MillisecondsMinutes":
                Double ans2 = Double.parseDouble(resulta.getText().toString());
                String cont2=String.valueOf(ans2/(1000*60));
                cont(cont2,resultb);
                break;
            case "MillisecondsHours":
                Double ans3 = Double.parseDouble(resulta.getText().toString());
                String cont3=String.valueOf(ans3/(1000*60*60));
                cont(cont3,resultb);
                break;
            case "MillisecondsDays":
                Double ans4 = Double.parseDouble(resulta.getText().toString());
                String cont4=String.valueOf(ans4/(1000*60*60*24));
                cont(cont4,resultb);
                break;
            case "MillisecondsWeeks":
                Double ans5 = Double.parseDouble(resulta.getText().toString());
                String cont5=String.valueOf(ans5/(1000*60*60*24*7));
                cont(cont5,resultb);
                break;
            case "SecondsMilliseconds":
                Double ans11 = Double.parseDouble(resulta.getText().toString());
                String cont11=String.valueOf(ans11*1000);
                cont(cont11,resultb);
                break;
            case "SecondsMinutes":
                Double ans12 = Double.parseDouble(resulta.getText().toString());
                String cont12=String.valueOf(ans12/60);
                cont(cont12,resultb);
                break;
            case "SecondsHours":
                Double ans13 = Double.parseDouble(resulta.getText().toString());
                String cont13=String.valueOf(ans13/(60*60));
                cont(cont13,resultb);
                break;
            case "SecondsDays":
                Double ans14 = Double.parseDouble(resulta.getText().toString());
                String cont14=String.valueOf(ans14/(60*60*24));
                cont(cont14,resultb);
                break;
            case "SecondsWeeks":
                Double ans15 = Double.parseDouble(resulta.getText().toString());
                String cont15=String.valueOf(ans15/(60*60*24*7));
                cont(cont15,resultb);
                break;
            case "MinutesMilliseconds":
                Double ans6 = Double.parseDouble(resulta.getText().toString());
                String cont6=String.valueOf(ans6*1000*60);
                cont(cont6,resultb);
                break;
            case "MinutesSeconds":
                Double ans7 = Double.parseDouble(resulta.getText().toString());
                String cont7=String.valueOf(ans7*60);
                cont(cont7,resultb);
                break;
            case "MinutesHours":
                Double ans8 = Double.parseDouble(resulta.getText().toString());
                String cont8=String.valueOf(ans8/60);
                cont(cont8,resultb);
                break;
            case "MinutesDays":
                Double ans9= Double.parseDouble(resulta.getText().toString());
                String cont9=String.valueOf(ans9/(60*24));
                cont(cont9,resultb);
                break;
            case "MinutesWeeks":
                Double ans10 = Double.parseDouble(resulta.getText().toString());
                String cont10=String.valueOf(ans10/(60*24*7));
                cont(cont10,resultb);
                break;
            case "HoursMilliseconds":
                Double ans16 = Double.parseDouble(resulta.getText().toString());
                String cont16=String.valueOf(ans16*60*60*1000);
                cont(cont16,resultb);
                break;
            case "HoursSeconds":
                Double ans17 = Double.parseDouble(resulta.getText().toString());
                String cont17=String.valueOf(ans17*(60*60));
                cont(cont17,resultb);
                break;
            case "HoursMinutes":
                Double ans18 = Double.parseDouble(resulta.getText().toString());
                String cont18=String.valueOf(ans18*60);
                cont(cont18,resultb);
                break;
            case "HoursDays":
                Double ans19= Double.parseDouble(resulta.getText().toString());
                String cont19=String.valueOf(ans19/24);
                cont(cont19,resultb);
                break;
            case "HoursWeeks":
                Double ans20 = Double.parseDouble(resulta.getText().toString());
                String cont20=String.valueOf(ans20/(24*7));
                cont(cont20,resultb);
                break;
            case "DaysMilliseconds":
                Double ans21 = Double.parseDouble(resulta.getText().toString());
                String cont21=String.valueOf(ans21*(1000*60*60*24));
                cont(cont21,resultb);
                break;
            case "DaysSeconds":
                Double ans22 = Double.parseDouble(resulta.getText().toString());
                String cont22=String.valueOf(ans22*(60*60*24));
                cont(cont22,resultb);
                break;
            case "DaysMinutes":
                Double ans23 = Double.parseDouble(resulta.getText().toString());
                String cont23=String.valueOf(ans23*(60*24));
                cont(cont23,resultb);
                break;
            case "DaysHours":
                Double ans24= Double.parseDouble(resulta.getText().toString());
                String cont24=String.valueOf(ans24*24);
                cont(cont24,resultb);
                break;
            case "DaysWeeks":
                Double ans25 = Double.parseDouble(resulta.getText().toString());
                String cont25=String.valueOf(ans25/7);
                cont(cont25,resultb);
                break;
            case "WeeksMilliseconds":
                Double ans26 = Double.parseDouble(resulta.getText().toString());
                String cont26=String.valueOf(ans26*(1000*60*60*24*7));
                cont(cont26,resultb);
                break;
            case "WeeksSeconds":
                Double ans27 = Double.parseDouble(resulta.getText().toString());
                String cont27=String.valueOf(ans27*(60*60*24*7));
                cont(cont27,resultb);
                break;
            case "WeeksMinutes":
                Double ans28 = Double.parseDouble(resulta.getText().toString());
                String cont28=String.valueOf(ans28*(60*24*7));
                cont(cont28,resultb);
                break;
            case "WeeksHours":
                Double ans29= Double.parseDouble(resulta.getText().toString());
                String cont29=String.valueOf(ans29*(24*7));
                cont(cont29,resultb);
                break;
            case "WeeksDays":
                Double ans30 = Double.parseDouble(resulta.getText().toString());
                String cont30=String.valueOf(ans30*7);
                cont(cont30,resultb);
                break;



            case "MillisecondsMilliseconds":
            case "SecondsSeconds":
            case "MinutesMinutes":
            case "HoursHours":
            case "DaysDays":
            case "WeeksWeeks":
                resultb.setText(resulta.getText().toString());




        }
    }


    void updateText(String str, EditText resulta) {

        String oldStr = resulta.getText().toString();
        int cursorPos = resulta.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        resulta.setText(String.format("%s%s%s", leftStr, str, rightStr));
        resulta.setSelection(cursorPos + str.length());
    }









}

