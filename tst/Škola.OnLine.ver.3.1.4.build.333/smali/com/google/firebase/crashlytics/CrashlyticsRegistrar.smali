.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;Lp5/e;)Lcom/google/firebase/crashlytics/a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b(Lp5/e;)Lcom/google/firebase/crashlytics/a;

    move-result-object p0

    return-object p0
.end method

.method private b(Lp5/e;)Lcom/google/firebase/crashlytics/a;
    .locals 4

    const-class v0, Lk5/e;

    invoke-interface {p1, v0}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk5/e;

    const-class v1, Ls5/a;

    invoke-interface {p1, v1}, Lp5/e;->h(Ljava/lang/Class;)Ln6/a;

    move-result-object v1

    const-class v2, Ln5/a;

    invoke-interface {p1, v2}, Lp5/e;->h(Ljava/lang/Class;)Ln6/a;

    move-result-object v2

    const-class v3, Lo6/e;

    invoke-interface {p1, v3}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo6/e;

    invoke-static {v0, p1, v1, v2}, Lcom/google/firebase/crashlytics/a;->e(Lk5/e;Lo6/e;Ln6/a;Ln6/a;)Lcom/google/firebase/crashlytics/a;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp5/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lp5/c;

    const-class v1, Lcom/google/firebase/crashlytics/a;

    invoke-static {v1}, Lp5/c;->c(Ljava/lang/Class;)Lp5/c$b;

    move-result-object v1

    const-string v2, "fire-cls"

    invoke-virtual {v1, v2}, Lp5/c$b;->h(Ljava/lang/String;)Lp5/c$b;

    move-result-object v1

    const-class v3, Lk5/e;

    invoke-static {v3}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Lo6/e;

    invoke-static {v3}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Ls5/a;

    invoke-static {v3}, Lp5/r;->a(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Ln5/a;

    invoke-static {v3}, Lp5/r;->a(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    new-instance v3, Lr5/f;

    invoke-direct {v3, p0}, Lr5/f;-><init>(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)V

    invoke-virtual {v1, v3}, Lp5/c$b;->f(Lp5/h;)Lp5/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lp5/c$b;->e()Lp5/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lp5/c$b;->d()Lp5/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "18.3.5"

    invoke-static {v2, v1}, Lh7/h;->b(Ljava/lang/String;Ljava/lang/String;)Lp5/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
