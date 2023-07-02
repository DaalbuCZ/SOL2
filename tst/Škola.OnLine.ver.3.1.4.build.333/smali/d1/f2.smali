.class public Ld1/f2;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private final a:Ld1/w2;

.field private final b:Ld1/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/m0<",
            "Ld1/j2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Ld1/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ld1/f2;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ld1/w2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "BugfenderApiManager must be not null"

    invoke-static {p1, v0}, Ld1/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ld1/f2;->a:Ld1/w2;

    new-instance p1, Ld1/m2;

    invoke-direct {p1}, Ld1/m2;-><init>()V

    iput-object p1, p0, Ld1/f2;->b:Ld1/m0;

    return-void
.end method

.method private e(Ljava/lang/Throwable;)V
    .locals 2

    instance-of v0, p1, Ld1/q0;

    if-eqz v0, :cond_0

    sget-object p1, Ld1/f2;->c:Ljava/lang/String;

    const-string v0, "Unrecognized application key."

    invoke-static {p1, v0}, Ld1/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ld1/f1;

    const-string v1, "Bugfender-SDK"

    if-eqz v0, :cond_1

    const-string p1, "Log limit reached"

    invoke-static {v1, p1}, Ld1/i0;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Ld1/k1;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of v0, p1, Ld1/j2;

    if-eqz v0, :cond_2

    check-cast p1, Ld1/j2;

    invoke-virtual {p1}, Ld1/j2;->a()I

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "The Internet permission is not available, please manually delete the app and reinstall it so the manifest can be updated"

    goto :goto_0

    :cond_2
    const-string p1, "Network error, will retry later"

    :goto_0
    invoke-static {v1, p1}, Ld1/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Ld1/z1;)J
    .locals 4

    :try_start_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Ld1/g;->a(Ld1/z1;Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ld1/f2;->a:Ld1/w2;

    const-string v1, "session"

    invoke-virtual {v0, v1, p1}, Ld1/w2;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ld1/h;->a(Ljava/lang/String;)Ld1/g2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld1/g2;->a()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :cond_0
    new-instance v0, Ld1/j2;

    const/4 v1, 0x2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected response body from server: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ld1/j2;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ld1/j2; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Ld1/f2;->b:Ld1/m0;

    invoke-interface {v0, p1}, Ld1/m0;->of(Ljava/lang/Object;)Ld1/v0;

    move-result-object p1

    invoke-direct {p0, p1}, Ld1/f2;->e(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public b(Ljava/lang/String;Ld1/c3;Ljava/util/Map;)Ld1/k3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ld1/c3;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Ld1/k3;"
        }
    .end annotation

    :try_start_0
    invoke-static {p1, p2, p3}, Ld1/d;->a(Ljava/lang/String;Ld1/c3;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ld1/f2;->a:Ld1/w2;

    const-string p3, "app/device-status"

    invoke-virtual {p2, p3, p1}, Ld1/w2;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ld1/e;->a(Ljava/lang/String;)Ld1/c;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ld1/c;->a()Ld1/c$a;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ld1/c$a;->a()I

    move-result p1

    const/16 p3, -0x3f9

    if-eq p1, p3, :cond_1

    const/16 p3, -0x3ec

    if-eq p1, p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ld1/j2;

    const-string p2, "Invalid app token"

    invoke-direct {p1, p3, p2}, Ld1/j2;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ld1/j2;

    const-string p2, "Deleted app"

    invoke-direct {p1, p3, p2}, Ld1/j2;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    new-instance p1, Ld1/k3$b;

    invoke-direct {p1}, Ld1/k3$b;-><init>()V

    invoke-virtual {p2}, Ld1/c;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Ld1/k3$b;->d(Z)Ld1/k3$b;

    move-result-object p1

    invoke-virtual {p2}, Ld1/c;->h()Z

    move-result p3

    invoke-virtual {p1, p3}, Ld1/k3$b;->b(Z)Ld1/k3$b;

    move-result-object p1

    invoke-virtual {p2}, Ld1/c;->e()Ld1/c$b;

    move-result-object p2

    invoke-virtual {p2}, Ld1/c$b;->a()I

    move-result p2

    invoke-virtual {p1, p2}, Ld1/k3$b;->a(I)Ld1/k3$b;

    move-result-object p1

    invoke-virtual {p1}, Ld1/k3$b;->c()Ld1/k3;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p2, Ld1/j2;

    const/4 p3, 0x2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected response body from server: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Ld1/j2;-><init>(ILjava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ld1/j2; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Ld1/f2;->b:Ld1/m0;

    invoke-interface {p2, p1}, Ld1/m0;->of(Ljava/lang/Object;)Ld1/v0;

    move-result-object p1

    invoke-direct {p0, p1}, Ld1/f2;->e(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public c(Ld1/d3;Ld1/z1;)V
    .locals 1

    :try_start_0
    invoke-static {p1, p2}, Ld1/f;->a(Ld1/d3;Ld1/z1;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ld1/f2;->a:Ld1/w2;

    const-string v0, "issue"

    invoke-virtual {p2, v0, p1}, Ld1/w2;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ld1/j2; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Ld1/f2;->b:Ld1/m0;

    invoke-interface {p2, p1}, Ld1/m0;->of(Ljava/lang/Object;)Ld1/v0;

    move-result-object p1

    invoke-direct {p0, p1}, Ld1/f2;->e(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ld1/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ld1/q<",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p1, p2, p3}, Ld1/i;->a(Ljava/lang/String;Ljava/lang/String;Ld1/q;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ld1/f2;->a:Ld1/w2;

    const-string p3, "device/keyvalue"

    invoke-virtual {p2, p3, p1}, Ld1/w2;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ld1/j2; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Ld1/f2;->b:Ld1/m0;

    invoke-interface {p2, p1}, Ld1/m0;->of(Ljava/lang/Object;)Ld1/v0;

    move-result-object p1

    invoke-direct {p0, p1}, Ld1/f2;->e(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public f(Ljava/util/List;Ld1/z1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld1/n0;",
            ">;",
            "Ld1/z1;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-static {p1, p2}, Ld1/j;->a(Ljava/util/List;Ld1/z1;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ld1/f2;->a:Ld1/w2;

    const-string v1, "log/batch"

    invoke-virtual {p2}, Ld1/z1;->l()J

    move-result-wide v2

    invoke-virtual {v0, v1, p1, v2, v3}, Ld1/w2;->c(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    :try_end_0
    .catch Ld1/j2; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Ld1/f2;->b:Ld1/m0;

    invoke-interface {p2, p1}, Ld1/m0;->of(Ljava/lang/Object;)Ld1/v0;

    move-result-object p1

    invoke-direct {p0, p1}, Ld1/f2;->e(Ljava/lang/Throwable;)V

    throw p1
.end method
