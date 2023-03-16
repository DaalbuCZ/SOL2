.class final Lv0/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll8/k$c;


# instance fields
.field private final n:Landroid/content/Context;

.field private final o:Lv0/a;

.field private final p:Lv0/n;

.field private final q:Lv0/p;

.field private r:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/content/Context;Lv0/a;Lv0/n;Lv0/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/l;->n:Landroid/content/Context;

    iput-object p2, p0, Lv0/l;->o:Lv0/a;

    iput-object p3, p0, Lv0/l;->p:Lv0/n;

    iput-object p4, p0, Lv0/l;->q:Lv0/p;

    return-void
.end method

.method public static synthetic a(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lv0/l;->f(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lv0/l;->e(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lv0/l;->h(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lv0/l;->g(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic e(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, p2, v0}, Ll8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic f(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, p2, v0}, Ll8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic g(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, p2, v0}, Ll8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic h(Ll8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, p2, v0}, Ll8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public i(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lv0/l;->r:Landroid/app/Activity;

    return-void
.end method

.method public onMethodCall(Ll8/j;Ll8/k$d;)V
    .locals 4

    iget-object v0, p1, Ll8/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "requestPermissions"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_1
    const-string v1, "openAppSettings"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_2
    const-string v1, "checkPermissionStatus"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_3
    const-string v1, "shouldShowRequestPermissionRationale"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_4
    const-string v1, "checkServiceStatus"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Ll8/k$d;->c()V

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {p1}, Ll8/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lv0/l;->p:Lv0/n;

    iget-object v1, p0, Lv0/l;->r:Landroid/app/Activity;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lv0/i;

    invoke-direct {v2, p2}, Lv0/i;-><init>(Ll8/k$d;)V

    new-instance v3, Lv0/d;

    invoke-direct {v3, p2}, Lv0/d;-><init>(Ll8/k$d;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lv0/n;->h(Ljava/util/List;Landroid/app/Activity;Lv0/n$b;Lv0/b;)V

    goto :goto_1

    :pswitch_1
    iget-object p1, p0, Lv0/l;->o:Lv0/a;

    iget-object v0, p0, Lv0/l;->n:Landroid/content/Context;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lv0/c;

    invoke-direct {v1, p2}, Lv0/c;-><init>(Ll8/k$d;)V

    new-instance v2, Lv0/f;

    invoke-direct {v2, p2}, Lv0/f;-><init>(Ll8/k$d;)V

    invoke-virtual {p1, v0, v1, v2}, Lv0/a;->a(Landroid/content/Context;Lv0/a$a;Lv0/b;)V

    goto :goto_1

    :pswitch_2
    iget-object p1, p1, Ll8/j;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, Lv0/l;->p:Lv0/n;

    iget-object v1, p0, Lv0/l;->n:Landroid/content/Context;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lv0/h;

    invoke-direct {v2, p2}, Lv0/h;-><init>(Ll8/k$d;)V

    invoke-virtual {v0, p1, v1, v2}, Lv0/n;->d(ILandroid/content/Context;Lv0/n$a;)V

    goto :goto_1

    :pswitch_3
    iget-object p1, p1, Ll8/j;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, Lv0/l;->p:Lv0/n;

    iget-object v1, p0, Lv0/l;->r:Landroid/app/Activity;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lv0/j;

    invoke-direct {v2, p2}, Lv0/j;-><init>(Ll8/k$d;)V

    new-instance v3, Lv0/g;

    invoke-direct {v3, p2}, Lv0/g;-><init>(Ll8/k$d;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lv0/n;->i(ILandroid/app/Activity;Lv0/n$c;Lv0/b;)V

    goto :goto_1

    :pswitch_4
    iget-object p1, p1, Ll8/j;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, Lv0/l;->q:Lv0/p;

    iget-object v1, p0, Lv0/l;->n:Landroid/content/Context;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lv0/k;

    invoke-direct {v2, p2}, Lv0/k;-><init>(Ll8/k$d;)V

    new-instance v3, Lv0/e;

    invoke-direct {v3, p2}, Lv0/e;-><init>(Ll8/k$d;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lv0/p;->a(ILandroid/content/Context;Lv0/p$a;Lv0/b;)V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5c086121 -> :sswitch_4
        -0x3ca2ffb7 -> :sswitch_3
        -0x22583c37 -> :sswitch_2
        0x14b278ba -> :sswitch_1
        0x637dca75 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
