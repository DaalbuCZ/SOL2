.class final Lc9/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/k$c;


# instance fields
.field private final n:Lc9/b;

.field private o:Lt8/k;


# direct methods
.method constructor <init>(Lc9/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/a;->n:Lc9/b;

    return-void
.end method

.method private static a(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private b(Lt8/k$d;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lc9/a;->n:Lc9/b;

    invoke-virtual {v0, p2}, Lc9/b;->a(Ljava/lang/String;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p1, p2}, Lt8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private c(Lt8/k$d;)V
    .locals 1

    iget-object v0, p0, Lc9/a;->n:Lc9/b;

    invoke-virtual {v0}, Lc9/b;->b()V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lt8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private d(Lt8/j;Lt8/k$d;Ljava/lang/String;)V
    .locals 7

    const-string v0, "useWebView"

    invoke-virtual {p1, v0}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const-string v0, "enableJavaScript"

    invoke-virtual {p1, v0}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const-string v0, "enableDomStorage"

    invoke-virtual {p1, v0}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    const-string v0, "headers"

    invoke-virtual {p1, v0}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lc9/a;->a(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object v3

    iget-object v1, p0, Lc9/a;->n:Lc9/b;

    move-object v2, p3

    invoke-virtual/range {v1 .. v6}, Lc9/b;->c(Ljava/lang/String;Landroid/os/Bundle;ZZZ)Lc9/b$a;

    move-result-object p1

    sget-object v0, Lc9/b$a;->o:Lc9/b$a;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    const-string p1, "NO_ACTIVITY"

    const-string p3, "Launching a URL requires a foreground activity."

    invoke-interface {p2, p1, p3, v1}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lc9/b$a;->p:Lc9/b$a;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p3, p1, v0

    const-string p3, "No Activity found to handle intent { %s }"

    invoke-static {p3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "ACTIVITY_NOT_FOUND"

    invoke-interface {p2, p3, p1, v1}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lt8/k$d;->a(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method e(Lt8/c;)V
    .locals 2

    iget-object v0, p0, Lc9/a;->o:Lt8/k;

    if-eqz v0, :cond_0

    const-string v0, "MethodCallHandlerImpl"

    const-string v1, "Setting a method call handler before the last was disposed."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lc9/a;->f()V

    :cond_0
    new-instance v0, Lt8/k;

    const-string v1, "plugins.flutter.io/url_launcher_android"

    invoke-direct {v0, p1, v1}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lc9/a;->o:Lt8/k;

    invoke-virtual {v0, p0}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method

.method f()V
    .locals 2

    iget-object v0, p0, Lc9/a;->o:Lt8/k;

    if-nez v0, :cond_0

    const-string v0, "MethodCallHandlerImpl"

    const-string v1, "Tried to stop listening when no MethodChannel had been initialized."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt8/k;->e(Lt8/k$c;)V

    iput-object v1, p0, Lc9/a;->o:Lt8/k;

    return-void
.end method

.method public onMethodCall(Lt8/j;Lt8/k$d;)V
    .locals 4

    const-string v0, "url"

    invoke-virtual {p1, v0}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p1, Lt8/j;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "closeWebView"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_1
    const-string v2, "canLaunch"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_2
    const-string v2, "launch"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    invoke-interface {p2}, Lt8/k$d;->c()V

    goto :goto_1

    :pswitch_0
    invoke-direct {p0, p2}, Lc9/a;->c(Lt8/k$d;)V

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, p2, v0}, Lc9/a;->b(Lt8/k$d;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_2
    invoke-direct {p0, p1, p2, v0}, Lc9/a;->d(Lt8/j;Lt8/k$d;Ljava/lang/String;)V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4226dc4d -> :sswitch_2
        -0xb0b8c5d -> :sswitch_1
        -0x73fbcff -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
