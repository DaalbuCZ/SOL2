.class public final Lcom/google/firebase/iid/Registrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/iid/Registrar$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static final synthetic lambda$getComponents$0$Registrar(Lp5/e;)Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 5

    new-instance v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    const-class v1, Lk5/e;

    invoke-interface {p0, v1}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk5/e;

    const-class v2, Lh7/i;

    invoke-interface {p0, v2}, Lp5/e;->g(Ljava/lang/Class;)Ln6/b;

    move-result-object v2

    const-class v3, Ll6/j;

    invoke-interface {p0, v3}, Lp5/e;->g(Ljava/lang/Class;)Ln6/b;

    move-result-object v3

    const-class v4, Lo6/e;

    invoke-interface {p0, v4}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo6/e;

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/iid/FirebaseInstanceId;-><init>(Lk5/e;Ln6/b;Ln6/b;Lo6/e;)V

    return-object v0
.end method

.method static final synthetic lambda$getComponents$1$Registrar(Lp5/e;)Lm6/a;
    .locals 2

    new-instance v0, Lcom/google/firebase/iid/Registrar$a;

    const-class v1, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-interface {p0, v1}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-direct {v0, p0}, Lcom/google/firebase/iid/Registrar$a;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp5/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-static {v0}, Lp5/c;->c(Ljava/lang/Class;)Lp5/c$b;

    move-result-object v1

    const-class v2, Lk5/e;

    invoke-static {v2}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v2, Lh7/i;

    invoke-static {v2}, Lp5/r;->i(Ljava/lang/Class;)Lp5/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v2, Ll6/j;

    invoke-static {v2}, Lp5/r;->i(Ljava/lang/Class;)Lp5/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v2, Lo6/e;

    invoke-static {v2}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    sget-object v2, Lcom/google/firebase/iid/o;->a:Lp5/h;

    invoke-virtual {v1, v2}, Lp5/c$b;->f(Lp5/h;)Lp5/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lp5/c$b;->c()Lp5/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lp5/c$b;->d()Lp5/c;

    move-result-object v1

    const-class v2, Lm6/a;

    invoke-static {v2}, Lp5/c;->c(Ljava/lang/Class;)Lp5/c$b;

    move-result-object v2

    invoke-static {v0}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v0

    invoke-virtual {v2, v0}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/iid/p;->a:Lp5/h;

    invoke-virtual {v0, v2}, Lp5/c$b;->f(Lp5/h;)Lp5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lp5/c$b;->d()Lp5/c;

    move-result-object v0

    const-string v2, "fire-iid"

    const-string v3, "21.1.0"

    invoke-static {v2, v3}, Lh7/h;->b(Ljava/lang/String;Ljava/lang/String;)Lp5/c;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lp5/c;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
