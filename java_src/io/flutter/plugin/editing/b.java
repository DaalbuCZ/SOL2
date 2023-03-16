package io.flutter.plugin.editing;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.c;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import k8.p;
/* loaded from: classes.dex */
public class b extends BaseInputConnection implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final View f8672a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8673b;

    /* renamed from: c  reason: collision with root package name */
    private final p f8674c;

    /* renamed from: d  reason: collision with root package name */
    private final c f8675d;

    /* renamed from: e  reason: collision with root package name */
    private final EditorInfo f8676e;

    /* renamed from: f  reason: collision with root package name */
    private ExtractedTextRequest f8677f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8678g;

    /* renamed from: h  reason: collision with root package name */
    private CursorAnchorInfo.Builder f8679h;

    /* renamed from: i  reason: collision with root package name */
    private ExtractedText f8680i;

    /* renamed from: j  reason: collision with root package name */
    private InputMethodManager f8681j;

    /* renamed from: k  reason: collision with root package name */
    private final Layout f8682k;

    /* renamed from: l  reason: collision with root package name */
    private io.flutter.plugin.editing.a f8683l;

    /* renamed from: m  reason: collision with root package name */
    private final a f8684m;

    /* renamed from: n  reason: collision with root package name */
    private int f8685n;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public b(View view, int i10, p pVar, a aVar, c cVar, EditorInfo editorInfo) {
        this(view, i10, pVar, aVar, cVar, editorInfo, new FlutterJNI());
    }

    public b(View view, int i10, p pVar, a aVar, c cVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f8678g = false;
        this.f8680i = new ExtractedText();
        this.f8685n = 0;
        this.f8672a = view;
        this.f8673b = i10;
        this.f8674c = pVar;
        this.f8675d = cVar;
        cVar.a(this);
        this.f8676e = editorInfo;
        this.f8684m = aVar;
        this.f8683l = new io.flutter.plugin.editing.a(flutterJNI);
        this.f8682k = new DynamicLayout(cVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f8681j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private boolean b(int i10) {
        if (i10 == 16908319) {
            setSelection(0, this.f8675d.length());
            return true;
        } else if (i10 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f8675d);
            int selectionEnd = Selection.getSelectionEnd(this.f8675d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f8672a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f8675d.subSequence(min, max)));
                this.f8675d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i10 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f8675d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f8675d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f8672a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f8675d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i10 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) this.f8672a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f8672a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.f8675d));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f8675d));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f8675d.delete(min2, max4);
                }
                this.f8675d.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        } else {
            return false;
        }
    }

    private CursorAnchorInfo c() {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        CursorAnchorInfo.Builder builder = this.f8679h;
        if (builder == null) {
            this.f8679h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f8679h.setSelectionRange(this.f8675d.i(), this.f8675d.h());
        int g10 = this.f8675d.g();
        int f10 = this.f8675d.f();
        if (g10 < 0 || f10 <= g10) {
            this.f8679h.setComposingText(-1, "");
        } else {
            this.f8679h.setComposingText(g10, this.f8675d.toString().subSequence(g10, f10));
        }
        return this.f8679h.build();
    }

    private ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f8680i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f8675d.i();
        this.f8680i.selectionEnd = this.f8675d.h();
        this.f8680i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f8675d.toString() : this.f8675d;
        return this.f8680i;
    }

    private boolean e(boolean z10, boolean z11) {
        int selectionStart = Selection.getSelectionStart(this.f8675d);
        int selectionEnd = Selection.getSelectionEnd(this.f8675d);
        boolean z12 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z10 ? Math.max(this.f8683l.b(this.f8675d, selectionEnd), 0) : Math.min(this.f8683l.a(this.f8675d, selectionEnd), this.f8675d.length());
        if (selectionStart == selectionEnd && !z11) {
            z12 = true;
        }
        if (z12) {
            setSelection(max, max);
        } else {
            setSelection(selectionStart, max);
        }
        return true;
    }

    private boolean g(boolean z10, boolean z11) {
        int selectionStart = Selection.getSelectionStart(this.f8675d);
        int selectionEnd = Selection.getSelectionEnd(this.f8675d);
        boolean z12 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z11) {
            z12 = true;
        }
        beginBatchEdit();
        if (z12) {
            if (z10) {
                Selection.moveUp(this.f8675d, this.f8682k);
            } else {
                Selection.moveDown(this.f8675d, this.f8682k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f8675d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z10) {
                Selection.extendUp(this.f8675d, this.f8682k);
            } else {
                Selection.extendDown(this.f8675d, this.f8682k);
            }
            setSelection(Selection.getSelectionStart(this.f8675d), Selection.getSelectionEnd(this.f8675d));
        }
        endBatchEdit();
        return true;
    }

    private byte[] h(InputStream inputStream, int i10) {
        int i11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i10];
        while (true) {
            try {
                i11 = inputStream.read(bArr);
            } catch (IOException unused) {
                i11 = -1;
            }
            if (i11 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
    }

    @Override // io.flutter.plugin.editing.c.b
    public void a(boolean z10, boolean z11, boolean z12) {
        this.f8681j.updateSelection(this.f8672a, this.f8675d.i(), this.f8675d.h(), this.f8675d.g(), this.f8675d.f());
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        ExtractedTextRequest extractedTextRequest = this.f8677f;
        if (extractedTextRequest != null) {
            this.f8681j.updateExtractedText(this.f8672a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f8678g) {
            this.f8681j.updateCursorAnchorInfo(this.f8672a, c());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f8675d.b();
        this.f8685n++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        return super.clearMetaKeyStates(i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f8675d.l(this);
        while (this.f8685n > 0) {
            endBatchEdit();
            this.f8685n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    @TargetApi(25)
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f8672a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] h10 = h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put("data", h10);
                                hashMap.put("uri", contentUri.toString());
                                this.f8674c.b(this.f8673b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        return super.commitText(charSequence, i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        if (this.f8675d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f8685n--;
        this.f8675d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            if (keyEvent.getAction() == 1 && (keyEvent.getKeyCode() == 59 || keyEvent.getKeyCode() == 60)) {
                int selectionEnd = Selection.getSelectionEnd(this.f8675d);
                setSelection(selectionEnd, selectionEnd);
                return true;
            }
            return false;
        } else if (keyEvent.getKeyCode() == 21) {
            return e(true, keyEvent.isShiftPressed());
        } else {
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f8676e;
                if ((131072 & editorInfo.inputType) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f8675d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f8675d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart < 0 || selectionEnd2 < 0 || unicodeChar == 0) {
                return false;
            }
            int min = Math.min(selectionStart, selectionEnd2);
            int max = Math.max(selectionStart, selectionEnd2);
            beginBatchEdit();
            if (min != max) {
                this.f8675d.delete(min, max);
            }
            this.f8675d.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
            int i10 = min + 1;
            setSelection(i10, i10);
            endBatchEdit();
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f8675d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        if (z10 == (this.f8677f == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z10 ? "on" : "off");
            x7.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f8677f = z10 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        beginBatchEdit();
        boolean b10 = b(i10);
        endBatchEdit();
        return b10;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        if (i10 == 0) {
            this.f8674c.o(this.f8673b);
        } else if (i10 == 1) {
            this.f8674c.g(this.f8673b);
        } else if (i10 == 2) {
            this.f8674c.f(this.f8673b);
        } else if (i10 == 3) {
            this.f8674c.l(this.f8673b);
        } else if (i10 == 4) {
            this.f8674c.m(this.f8673b);
        } else if (i10 == 5) {
            this.f8674c.h(this.f8673b);
        } else if (i10 != 7) {
            this.f8674c.e(this.f8673b);
        } else {
            this.f8674c.j(this.f8673b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f8674c.i(this.f8673b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if ((i10 & 1) != 0) {
            this.f8681j.updateCursorAnchorInfo(this.f8672a, c());
        }
        boolean z10 = (i10 & 2) != 0;
        if (z10 != this.f8678g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z10 ? "on" : "off");
            x7.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f8678g = z10;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f8684m.a(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        return super.setComposingRegion(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i10) : super.setComposingText(charSequence, i10);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        beginBatchEdit();
        boolean selection = super.setSelection(i10, i11);
        endBatchEdit();
        return selection;
    }
}
