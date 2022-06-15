package osp.smgonggu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItemDetailActivity extends AppCompatActivity {
    public Button chatButton;
    public Button favButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        chatButton = findViewById(R.id.chatButton);
        favButton = findViewById(R.id.favButton);
        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });

        favButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailActivity.this, FavoritesActivity.class);
                startActivity(intent);
            }
        });
    }
}