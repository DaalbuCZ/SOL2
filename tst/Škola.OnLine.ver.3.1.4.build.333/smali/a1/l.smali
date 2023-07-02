.class final La1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/k$c;


# instance fields
.field private final n:Landroid/content/Context;

.field private final o:La1/a;

.field private final p:La1/n;

.field private final q:La1/p;

.field private r:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/content/Context;La1/a;La1/n;La1/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/l;->n:Landroid/content/Context;

    iput-object p2, p0, La1/l;->o:La1/a;

    iput-object p3, p0, La1/l;->p:La1/n;

    iput-object p4, p0, La1/l;->q:La1/p;

    return-void
.end method

.method public static synthetic a(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, La1/l;->f(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, La1/l;->e(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, La1/l;->h(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, La1/l;->g(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic e(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, p2, v0}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic f(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, p2, v0}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic g(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, p2, v0}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic h(Lt8/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, p2, v0}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public i(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, La1/l;->r:Landroid/app/Activity;

    return-void
.end method

.method public onMethodCall(Lt8/j;Lt8/k$d;)V
    .locals 4

    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

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

    invoke-interface {p2}, Lt8/k$d;->c()V

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {p1}, Lt8/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, La1/l;->p:La1/n;

    iget-object v1, p0, La1/l;->r:Landroid/app/Activity;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, La1/i;

    invoke-direct {v2, p2}, La1/i;-><init>(Lt8/k$d;)V

    new-instance v3, La1/d;

    invoke-direct {v3, p2}, La1/d;-><init>(Lt8/k$d;)V

    invoke-virtual {v0, p1, v1, v2, v3}, La1/n;->h(Ljava/util/List;Landroid/app/Activity;La1/n$b;La1/b;)V

    goto :goto_1

    :pswitch_1
    iget-object p1, p0, La1/l;->o:La1/a;

    iget-object v0, p0, La1/l;->n:Landroid/content/Context;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, La1/c;

    invoke-direct {v1, p2}, La1/c;-><init>(Lt8/k$d;)V

    new-instance v2, La1/f;

    invoke-direct {v2, p2}, La1/f;-><init>(Lt8/k$d;)V

    invoke-virtual {p1, v0, v1, v2}, La1/a;->a(Landroid/content/Context;La1/a$a;La1/b;)V

    goto :goto_1

    :pswitch_2
    iget-object p1, p1, Lt8/j;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, La1/l;->p:La1/n;

    iget-object v1, p0, La1/l;->n:Landroid/content/Context;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, La1/h;

    invoke-direct {v2, p2}, La1/h;-><init>(Lt8/k$d;)V

    invoke-virtual {v0, p1, v1, v2}, La1/n;->d(ILandroid/content/Context;La1/n$a;)V

    goto :goto_1

    :pswitch_3
    iget-object p1, p1, Lt8/j;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, La1/l;->p:La1/n;

    iget-object v1, p0, La1/l;->r:Landroid/app/Activity;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, La1/j;

    invoke-direct {v2, p2}, La1/j;-><init>(Lt8/k$d;)V

    new-instance v3, La1/g;

    invoke-direct {v3, p2}, La1/g;-><init>(Lt8/k$d;)V

    invoke-virtual {v0, p1, v1, v2, v3}, La1/n;->i(ILandroid/app/Activity;La1/n$c;La1/b;)V

    goto :goto_1

    :pswitch_4
    iget-object p1, p1, Lt8/j;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, La1/l;->q:La1/p;

    iget-object v1, p0, La1/l;->n:Landroid/content/Context;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, La1/k;

    invoke-direct {v2, p2}, La1/k;-><init>(Lt8/k$d;)V

    new-instance v3, La1/e;

    invoke-direct {v3, p2}, La1/e;-><init>(Lt8/k$d;)V

    invoke-virtual {v0, p1, v1, v2, v3}, La1/p;->a(ILandroid/content/Context;La1/p$a;La1/b;)V

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
