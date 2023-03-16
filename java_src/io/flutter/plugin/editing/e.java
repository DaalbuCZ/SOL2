package io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f8704a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f8705b;

    /* renamed from: c  reason: collision with root package name */
    private int f8706c;

    /* renamed from: d  reason: collision with root package name */
    private int f8707d;

    /* renamed from: e  reason: collision with root package name */
    private int f8708e;

    /* renamed from: f  reason: collision with root package name */
    private int f8709f;

    /* renamed from: g  reason: collision with root package name */
    private int f8710g;

    /* renamed from: h  reason: collision with root package name */
    private int f8711h;

    public e(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        this.f8708e = i10;
        this.f8709f = i11;
        this.f8710g = i12;
        this.f8711h = i13;
        a(charSequence, "", -1, -1);
    }

    public e(CharSequence charSequence, int i10, int i11, CharSequence charSequence2, int i12, int i13, int i14, int i15) {
        this.f8708e = i12;
        this.f8709f = i13;
        this.f8710g = i14;
        this.f8711h = i15;
        a(charSequence, charSequence2.toString(), i10, i11);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i10, int i11) {
        this.f8704a = charSequence;
        this.f8705b = charSequence2;
        this.f8706c = i10;
        this.f8707d = i11;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f8704a.toString());
            jSONObject.put("deltaText", this.f8705b.toString());
            jSONObject.put("deltaStart", this.f8706c);
            jSONObject.put("deltaEnd", this.f8707d);
            jSONObject.put("selectionBase", this.f8708e);
            jSONObject.put("selectionExtent", this.f8709f);
            jSONObject.put("composingBase", this.f8710g);
            jSONObject.put("composingExtent", this.f8711h);
        } catch (JSONException e10) {
            x7.b.b("TextEditingDelta", "unable to create JSONObject: " + e10);
        }
        return jSONObject;
    }
}
