.class public Lio/flutter/plugin/editing/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls8/n$b;
.implements Landroid/view/textservice/SpellCheckerSession$SpellCheckerSessionListener;


# instance fields
.field private final a:Ls8/n;

.field private final b:Landroid/view/textservice/TextServicesManager;

.field private c:Landroid/view/textservice/SpellCheckerSession;

.field d:Lt8/k$d;


# direct methods
.method public constructor <init>(Landroid/view/textservice/TextServicesManager;Ls8/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/editing/d;->b:Landroid/view/textservice/TextServicesManager;

    iput-object p2, p0, Lio/flutter/plugin/editing/d;->a:Ls8/n;

    invoke-virtual {p2, p0}, Ls8/n;->b(Ls8/n$b;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lt8/k$d;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/editing/d;->d:Lt8/k$d;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    const-string p2, "error"

    const-string v0, "Previous spell check request still pending."

    invoke-interface {p3, p2, v0, p1}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    iput-object p3, p0, Lio/flutter/plugin/editing/d;->d:Lt8/k$d;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugin/editing/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/editing/d;->a:Ls8/n;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ls8/n;->b(Ls8/n$b;)V

    iget-object v0, p0, Lio/flutter/plugin/editing/d;->c:Landroid/view/textservice/SpellCheckerSession;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/textservice/SpellCheckerSession;->close()V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Lu8/a;->b(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugin/editing/d;->c:Landroid/view/textservice/SpellCheckerSession;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/editing/d;->b:Landroid/view/textservice/TextServicesManager;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, p1, p0, v1}, Landroid/view/textservice/TextServicesManager;->newSpellCheckerSession(Landroid/os/Bundle;Ljava/util/Locale;Landroid/view/textservice/SpellCheckerSession$SpellCheckerSessionListener;Z)Landroid/view/textservice/SpellCheckerSession;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugin/editing/d;->c:Landroid/view/textservice/SpellCheckerSession;

    :cond_0
    new-array p1, v1, [Landroid/view/textservice/TextInfo;

    const/4 v0, 0x0

    new-instance v1, Landroid/view/textservice/TextInfo;

    invoke-direct {v1, p2}, Landroid/view/textservice/TextInfo;-><init>(Ljava/lang/String;)V

    aput-object v1, p1, v0

    iget-object p2, p0, Lio/flutter/plugin/editing/d;->c:Landroid/view/textservice/SpellCheckerSession;

    const/4 v0, 0x5

    invoke-virtual {p2, p1, v0}, Landroid/view/textservice/SpellCheckerSession;->getSentenceSuggestions([Landroid/view/textservice/TextInfo;I)V

    return-void
.end method

.method public onGetSentenceSuggestions([Landroid/view/textservice/SentenceSuggestionsInfo;)V
    .locals 10

    array-length v0, p1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object p1, p0, Lio/flutter/plugin/editing/d;->d:Lt8/k$d;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1, v0}, Lt8/k$d;->a(Ljava/lang/Object;)V

    iput-object v1, p0, Lio/flutter/plugin/editing/d;->d:Lt8/k$d;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    aget-object p1, p1, v2

    move v3, v2

    :goto_1
    invoke-virtual {p1}, Landroid/view/textservice/SentenceSuggestionsInfo;->getSuggestionsCount()I

    move-result v4

    if-ge v3, v4, :cond_3

    invoke-virtual {p1, v3}, Landroid/view/textservice/SentenceSuggestionsInfo;->getSuggestionsInfoAt(I)Landroid/view/textservice/SuggestionsInfo;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/textservice/SuggestionsInfo;->getSuggestionsCount()I

    move-result v5

    if-gtz v5, :cond_1

    goto :goto_3

    :cond_1
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1, v3}, Landroid/view/textservice/SentenceSuggestionsInfo;->getOffsetAt(I)I

    move-result v7

    invoke-virtual {p1, v3}, Landroid/view/textservice/SentenceSuggestionsInfo;->getLengthAt(I)I

    move-result v8

    add-int/2addr v8, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v9, "startIndex"

    invoke-virtual {v6, v9, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "endIndex"

    invoke-virtual {v6, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move v8, v2

    :goto_2
    if-ge v8, v5, :cond_2

    invoke-virtual {v4, v8}, Landroid/view/textservice/SuggestionsInfo;->getSuggestionAt(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_2
    const-string v4, "suggestions"

    invoke-virtual {v6, v4, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lio/flutter/plugin/editing/d;->d:Lt8/k$d;

    goto :goto_0
.end method

.method public onGetSuggestions([Landroid/view/textservice/SuggestionsInfo;)V
    .locals 0

    return-void
.end method
