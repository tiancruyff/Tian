package test.easemob.com.tian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tinkerpatch.sdk.TinkerPatch;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TinkerPatch.with().fetchPatchUpdate(true);
	}
}
