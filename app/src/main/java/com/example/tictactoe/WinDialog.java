package com.example.tictactoe;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class WinDialog extends Dialog {
    private final String massage;
    private final MainActivity mainActivity;
    public WinDialog(@NonNull Context context,String massage,MainActivity mainActivity) {
        super(context);
        this.massage = massage;
        this.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win_dialog_layout);
        final TextView massageText = findViewById(R.id.massageTxt);
        final Button startAgainBtn = findViewById(R.id.startGameBtn);
        massageText.setText(massage);
        startAgainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.restartMatch();
                dismiss();
            }
        });
    }
}
