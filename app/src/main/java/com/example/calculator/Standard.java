package com.example.calculator;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class Standard extends Fragment {

    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bplus, bminus, bmul, bdiv, bmod, bequal, bdot, bclear, bBracket, bneg;
    private ImageButton bBackspace;
    private boolean negative = true;
    private boolean bracket = true;
    private String text, text1;
    private boolean isReached = false, checked = true;
    private boolean val, val1;
    private String string;
    private String finalResult = "";

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.standard);
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View rootView= inflater.inflate(R.layout.standard,container,false);


        EditText result = (EditText) rootView.findViewById(R.id.EditView);
        //string=result.getText().toString();
        result.setShowSoftInputOnFocus(false);

        TextView result1 = (TextView) rootView.findViewById(R.id.TextView);

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
        bplus = (Button) rootView.findViewById(R.id.plus);
        bminus = (Button) rootView.findViewById(R.id.minus);
        bmul = (Button) rootView.findViewById(R.id.multiply);
        bdiv = (Button) rootView.findViewById(R.id.divide);
        bmod = (Button) rootView.findViewById(R.id.modulus);
        bequal = (Button) rootView.findViewById(R.id.equal);
        bdot = (Button) rootView.findViewById(R.id.dot);
        bclear = (Button) rootView.findViewById(R.id.C);
        bBracket = (Button) rootView.findViewById(R.id.bracket);
        bneg = (Button) rootView.findViewById(R.id.negative);
        bBackspace = (ImageButton) rootView.findViewById(R.id.BackSpace);



         // in onCreate method
        result.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Nothing
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            //nothing
            }

            @Override
            public void afterTextChanged(Editable s) {
                // if edittext has 10chars & this is not called yet, add new line
                if(result.getText().length() == 15 && !isReached) {
                  Toast.makeText(getActivity(),"Cannot enter more 15 digits",Toast.LENGTH_SHORT).show();
                    isReached = true;
                }
                // if edittext has less than 10chars & boolean has changed, reset
                if(result.getText().length() < 15 && isReached) isReached = false;
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // result.setText(string+ "0");
             updateText("0",result);
            }


        });
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateText( "1",result);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              updateText("2",result);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               updateText("3",result);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText( "4",result);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               updateText("5",result);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              updateText( "6",result);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               updateText( "7",result);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText( "8",result);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               updateText("9",result);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("+",result);
            }

        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             updateText("-",result);
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               updateText("×",result);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               updateText("÷",result);
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(".",result);
            }

        });

        bneg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = result.getText().toString();
                if (negative) {
                    result.setText("-" + text);
                    negative = false;
                } else {
                    text = text.substring(1, text.length());
                    result.setText(text);
                    negative = true;
                }
            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               updateText( "%",result);
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                result1.setText("");
            }
        });
        bBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bracket) {
                   updateText("(",result);
                    bracket = false;
                } else {
                   updateText(")",result);
                    bracket = true;
                }
            }
        });
        bBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cursorPos = result.getSelectionStart();
                int texlen = result.getText().length();
                if (texlen != 0 && cursorPos != 0) {
                    SpannableStringBuilder selection = (SpannableStringBuilder) result.getText();
                    selection.replace(cursorPos - 1, cursorPos, "");
                    result.setText(selection);
                    result.setSelection(cursorPos - 1);
                }

            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    text1 = result.getText().toString();

                    text1 = text1.replaceAll("×", "*");
                    text1 = text1.replaceAll("÷", "/");
                    Context rhino = Context.enter();
                    rhino.setOptimizationLevel(-1);

                    try {
                        Scriptable scriptable = rhino.initStandardObjects();
                        finalResult = rhino.evaluateString(scriptable, text1, "javascript", 1, null).toString();
                        if (finalResult.endsWith(".0")) {
                            finalResult = finalResult.substring(0, finalResult.length() - 2);
                        }


                    } catch (Exception e) {
                        finalResult = "0";
                    }

                    result1.setText(finalResult);
                    val = true;

                }



        });
        result.setSelection(result.getText().length());

        return rootView;
    }
    void updateText(String str, EditText resulta) {
        if(!isReached) {
            String oldStr = resulta.getText().toString();
            int cursorPos = resulta.getSelectionStart();
            String leftStr = oldStr.substring(0, cursorPos);
            String rightStr = oldStr.substring(cursorPos);
            resulta.setText(String.format("%s%s%s", leftStr, str, rightStr));
            resulta.setSelection(cursorPos + str.length());
        }

    }



}
