package com.bugfender.sdk.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.Serializable;
import java.net.URL;
import w0.d;
import y0.i0;
/* loaded from: classes.dex */
public class FeedbackActivity extends Activity {

    /* renamed from: n  reason: collision with root package name */
    private ImageView f3290n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f3291o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f3292p;

    /* renamed from: q  reason: collision with root package name */
    private TextView f3293q;

    /* renamed from: r  reason: collision with root package name */
    private EditText f3294r;

    /* renamed from: s  reason: collision with root package name */
    private EditText f3295s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedbackActivity.this.setResult(0);
            FeedbackActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            URL x10 = y0.a.x(FeedbackActivity.this.f3294r.getText().toString(), FeedbackActivity.this.f3295s.getText().toString());
            if (x10 != null) {
                Intent intent = new Intent();
                intent.putExtra("result.feedback.url", x10.toString());
                FeedbackActivity.this.setResult(-1, intent);
            }
            FeedbackActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements Serializable {

        /* renamed from: n  reason: collision with root package name */
        final String f3298n;

        /* renamed from: o  reason: collision with root package name */
        final String f3299o;

        /* renamed from: p  reason: collision with root package name */
        final String f3300p;

        /* renamed from: q  reason: collision with root package name */
        final String f3301q;

        /* renamed from: r  reason: collision with root package name */
        final String f3302r;

        private c() {
            this.f3298n = "Feedback";
            this.f3299o = "Please insert your feedback here and click send";
            this.f3300p = "Feedback subject";
            this.f3301q = "Feedback message";
            this.f3302r = "Send";
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        c(String str, String str2, String str3, String str4, String str5) {
            this.f3298n = str;
            this.f3299o = str2;
            this.f3300p = str3;
            this.f3301q = str4;
            this.f3302r = str5;
        }
    }

    private void b() {
        com.bugfender.sdk.ui.a aVar = getIntent().hasExtra("extra.style") ? (com.bugfender.sdk.ui.a) getIntent().getSerializableExtra("extra.style") : new com.bugfender.sdk.ui.a();
        findViewById(w0.c.appbar_rl).setBackgroundResource(aVar.f3303n);
        this.f3290n.setColorFilter(getResources().getColor(aVar.f3305p), PorterDuff.Mode.SRC_ATOP);
        this.f3291o.setTextColor(getResources().getColor(aVar.f3304o));
        this.f3292p.setTextColor(getResources().getColor(aVar.f3306q));
        findViewById(w0.c.root_vg).setBackgroundResource(aVar.f3307r);
        this.f3293q.setTextColor(getResources().getColor(aVar.f3308s));
        TextView textView = (TextView) findViewById(w0.c.bugfender_tv);
        Drawable drawable = getResources().getDrawable(w0.b.bf_bugfender_logo);
        drawable.setColorFilter(getResources().getColor(aVar.f3308s), PorterDuff.Mode.SRC_ATOP);
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setTextColor(getResources().getColor(aVar.f3308s));
        this.f3294r.setTextColor(getResources().getColor(aVar.f3310u));
        this.f3294r.setHintTextColor(getResources().getColor(aVar.f3311v));
        this.f3294r.setBackgroundResource(aVar.f3309t);
        this.f3295s.setTextColor(getResources().getColor(aVar.f3310u));
        this.f3295s.setHintTextColor(getResources().getColor(aVar.f3311v));
        this.f3295s.setBackgroundResource(aVar.f3309t);
    }

    private void d() {
        c cVar = getIntent().hasExtra("extra.texts") ? (c) getIntent().getSerializableExtra("extra.texts") : new c(null);
        this.f3291o.setText(cVar.f3298n);
        this.f3292p.setText(cVar.f3302r);
        this.f3293q.setText(cVar.f3299o);
        this.f3294r.setHint(cVar.f3300p);
        this.f3295s.setHint(cVar.f3301q);
    }

    public static Intent e(Context context, String str, String str2, String str3, String str4, String str5, com.bugfender.sdk.ui.a aVar) {
        Intent intent = new Intent(context, FeedbackActivity.class);
        intent.putExtra("extra.texts", new c(str, str2, str3, str4, str5));
        if (aVar == null) {
            aVar = new com.bugfender.sdk.ui.a();
        }
        intent.putExtra("extra.style", aVar);
        return intent;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(d.bf_feedback_screen);
            this.f3290n = (ImageView) findViewById(w0.c.close_iv);
            this.f3291o = (TextView) findViewById(w0.c.title_tv);
            this.f3292p = (TextView) findViewById(w0.c.positive_action_tv);
            this.f3293q = (TextView) findViewById(w0.c.message_tv);
            this.f3294r = (EditText) findViewById(w0.c.feedback_title_et);
            this.f3295s = (EditText) findViewById(w0.c.feedback_message_et);
            d();
            b();
            this.f3290n.setOnClickListener(new a());
            this.f3292p.setOnClickListener(new b());
        } catch (RuntimeException e10) {
            i0.b("FeedbackActivity", "Error inflating view. This is known to happen when performing Google Play pre-launch tests but it doesn't occur during app real usage", e10);
            finish();
        }
    }
}
