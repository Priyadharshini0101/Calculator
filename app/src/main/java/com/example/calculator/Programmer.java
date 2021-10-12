package com.example.calculator;

import android.app.ActionBar;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import java.util.Objects;


public class Programmer extends Fragment {
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bb, bc, bd, be, bf, bplus, bminus, bmul, bdiv, bmod, bequal, bclear, bBracket, bneg, band, bor, bnot, bxor, blsh, brsh, bbin, bdec, boct, bhex;
    private ImageButton bBackspace;
    private boolean negative = true;
    private boolean bracket = true;
    private String text, text1;
    private boolean isReached = false, checked = true;
    private boolean Binary, Octal, Hexadecimal, Decimal;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.programmer, container, false);


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
        ba = (Button) rootView.findViewById(R.id.a);
        bb = (Button) rootView.findViewById(R.id.b);
        bc = (Button) rootView.findViewById(R.id.c);
        bd = (Button) rootView.findViewById(R.id.d);
        be = (Button) rootView.findViewById(R.id.e);
        bf = (Button) rootView.findViewById(R.id.f);
        bplus = (Button) rootView.findViewById(R.id.plus);
        bminus = (Button) rootView.findViewById(R.id.minus);
        bmul = (Button) rootView.findViewById(R.id.multiply);
        bdiv = (Button) rootView.findViewById(R.id.divide);
        bmod = (Button) rootView.findViewById(R.id.modulus);
        bequal = (Button) rootView.findViewById(R.id.equal);
        bclear = (Button) rootView.findViewById(R.id.C);
        bBracket = (Button) rootView.findViewById(R.id.bracket);
        bneg = (Button) rootView.findViewById(R.id.negative);
        bBackspace = (ImageButton) rootView.findViewById(R.id.BackSpace);
        band = (Button) rootView.findViewById(R.id.and);
        bor = (Button) rootView.findViewById(R.id.or);
        bnot = (Button) rootView.findViewById(R.id.not);
        bxor = (Button) rootView.findViewById(R.id.xor);
        blsh = (Button) rootView.findViewById(R.id.leftshift);
        brsh = (Button) rootView.findViewById(R.id.right_shift);
        bbin = (Button) rootView.findViewById(R.id.binary);
        bdec = (Button) rootView.findViewById(R.id.decimal);
        boct = (Button) rootView.findViewById(R.id.octal);
        bhex = (Button) rootView.findViewById(R.id.hexadecimal);

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
                updateText("0", result);
            }


        });
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateText("1", result);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("2", result);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("3", result);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("4", result);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("5", result);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("6", result);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("7", result);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("8", result);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("9", result);
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("A", result);
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("B", result);
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("C", result);
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("D", result);
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("E", result);
            }
        });
        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("F", result);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("+", result);
            }

        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("-", result);
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("×", result);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("÷", result);
            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("%", result);
            }
        });
        bor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                updateText("OR", result);
            }
        });
        band.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("AND", result);
            }
        });
        bnot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("NOT", result);
            }
        });
        bxor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("XOR", result);
            }
        });
        bbin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Binary = true;
                Octal = false;
                Hexadecimal = false;
                Decimal = false;
                b0.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                ba.setEnabled(false);
                bb.setEnabled(false);
                bc.setEnabled(false);
                bd.setEnabled(false);
                be.setEnabled(false);
                bf.setEnabled(false);

            }
        });
        boct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Octal = true;
                Binary = false;
                Hexadecimal = false;
                Decimal = false;
                b0.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(false);
                b9.setEnabled(false);
                ba.setEnabled(false);
                bb.setEnabled(false);
                bc.setEnabled(false);
                bd.setEnabled(false);
                be.setEnabled(false);
                bf.setEnabled(false);


            }
        });
        bhex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hexadecimal = true;
                Binary = false;
                Octal = false;
                Decimal = false;
                b0.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                ba.setEnabled(true);
                bb.setEnabled(true);
                bc.setEnabled(true);
                bd.setEnabled(true);
                be.setEnabled(true);
                bf.setEnabled(true);


            }
        });
        bdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Binary = false;
                Octal = false;
                Hexadecimal = false;
                Decimal = true;
                b0.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                ba.setEnabled(false);
                bb.setEnabled(false);
                bc.setEnabled(false);
                bd.setEnabled(false);
                be.setEnabled(false);
                bf.setEnabled(false);


            }
        });
        blsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("Lsh", result);
            }
        });
        brsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("Rsh", result);
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
                    updateText("(", result);
                    bracket = false;
                } else {
                    updateText(")", result);
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
                    SpannableStringBuilder selection = (SpannableStringBuilder) result.getText();//String builder are mutuable
                    //where stirng in java are unmutuable and spannable can change the contents of the string
                    selection.replace(cursorPos - 1, cursorPos, "");
                    result.setText(selection);
                    result.setSelection(cursorPos - 1);
                }

            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val1 = result.getText().toString();//getting value 5+5
                String replacedstr = val1.replace("÷", "/").replace("AND","&").replace("XOR","^").replace("NOT", "~").replace("Lsh", ">").replace("Rsh", "<").replace("A", "10").replace("B", "11").replace("C", "12").replace("D", "13").replace("E", "14").replace("F", "15").replace("×", "*").replace("OR", "|");//change divide and multiply symbols
                int resulta = eval(replacedstr);//passing "string" to eval function
                String resultb;
                if (Binary) {
                    resultb = Integer.toBinaryString(resulta);
                    result1.setText(resultb);
                } else if (Octal) {
                    resultb = Integer.toOctalString(resulta);
                    result1.setText(resultb);
                } else if (Hexadecimal) {
                    resultb = Integer.toHexString(resulta);
                    result1.setText(resultb);
                }else{
                    resultb=String.valueOf(resulta);
                    result1.setText(resultb);
                }

                result.setText(val1);

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


    public int eval(final String str) {//passed stirng is the final one to start eval
        return new Object() {//
            int pos = -1, ch;//pos(current) ch(current char)

            //current position is less than the strlenght check and assign ch =charAtpos or return -1
            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            int parse() {
                nextChar();
                int x = parseExpression();//call to parseExpression
                if (pos < str.length()) x = 0;//out of range
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor
//by bodmas
            int parseExpression() {
                int x = parseTerm();//call to parseTerm
                for (; ; ) {//infinte loop
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm();
                    else if (eat('&')) x =x & parseTerm();
                    else return x;
                }
            }

            int parseTerm() {
                int x = parseFactor();//call to parseFactor
                for (; ; ) {//infinite loop
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else if (eat('|')) x |= parseFactor();// subtraction

                    else if (eat('<')) x = x >> parseFactor();
                    else if (eat('>')) x = x << parseFactor();
                    else if (eat('^')) x =x ^ parseFactor();
                    else if(eat('%')) x%=parseFactor();




                    else return x;
                }
            }

            int parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor();
                if(eat('~')) return ~parseFactor();




                // unary minus

                int x = 0;
                int startPos = this.pos;

                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { //values
                    while ((ch >= '0' && ch <= '9') || ch == '.')
                        nextChar();//values on which the operator
                    x = Integer.parseInt(str.substring(startPos, this.pos));//parsing to double type
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z')
                        nextChar();//function that is operator on which the operands are to be performed
                    String func = str.substring(startPos, this.pos);//assigning it to the String
                    x = parseFactor();
                }
                return x;
            }


        }.parse();


    }
}