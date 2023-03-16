package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import k8.n;
import l8.k;
/* loaded from: classes.dex */
public class d implements n.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a  reason: collision with root package name */
    private final n f8700a;

    /* renamed from: b  reason: collision with root package name */
    private final TextServicesManager f8701b;

    /* renamed from: c  reason: collision with root package name */
    private SpellCheckerSession f8702c;

    /* renamed from: d  reason: collision with root package name */
    k.d f8703d;

    public d(TextServicesManager textServicesManager, n nVar) {
        this.f8701b = textServicesManager;
        this.f8700a = nVar;
        nVar.b(this);
    }

    @Override // k8.n.b
    public void a(String str, String str2, k.d dVar) {
        if (this.f8703d != null) {
            dVar.b("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f8703d = dVar;
        c(str, str2);
    }

    public void b() {
        this.f8700a.b(null);
        SpellCheckerSession spellCheckerSession = this.f8702c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale b10 = m8.a.b(str);
        if (this.f8702c == null) {
            this.f8702c = this.f8701b.newSpellCheckerSession(null, b10, this, true);
        }
        this.f8702c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        k.d dVar;
        if (sentenceSuggestionsInfoArr.length == 0) {
            dVar = this.f8703d;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            for (int i10 = 0; i10 < sentenceSuggestionsInfo.getSuggestionsCount(); i10++) {
                SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i10);
                int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                if (suggestionsCount > 0) {
                    HashMap hashMap = new HashMap();
                    int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i10);
                    int lengthAt = sentenceSuggestionsInfo.getLengthAt(i10) + offsetAt;
                    hashMap.put("startIndex", Integer.valueOf(offsetAt));
                    hashMap.put("endIndex", Integer.valueOf(lengthAt));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < suggestionsCount; i11++) {
                        arrayList2.add(suggestionsInfoAt.getSuggestionAt(i11));
                    }
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
            dVar = this.f8703d;
        }
        dVar.a(arrayList);
        this.f8703d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
