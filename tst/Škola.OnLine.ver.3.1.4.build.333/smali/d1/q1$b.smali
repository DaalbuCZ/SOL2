.class Ld1/q1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/h2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/q1;->k(Ld1/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld1/h2<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ld1/q;

.field final synthetic b:Ld1/q1;


# direct methods
.method constructor <init>(Ld1/q1;Ld1/q;)V
    .locals 0

    iput-object p1, p0, Ld1/q1$b;->b:Ld1/q1;

    iput-object p2, p0, Ld1/q1$b;->a:Ld1/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Ld1/q1$b;->c(Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set device data \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld1/q1$b;->a:Ld1/q;

    invoke-virtual {v1}, Ld1/q;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld1/q1$b;->a:Ld1/q;

    invoke-virtual {v1}, Ld1/q;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\" failed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Bugfender-SDK"

    invoke-static {v1, v0, p1}, Ld1/i0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public c(Ljava/lang/Boolean;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Set device data \""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ld1/q1$b;->a:Ld1/q;

    invoke-virtual {v0}, Ld1/q;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\"=\""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ld1/q1$b;->a:Ld1/q;

    invoke-virtual {v0}, Ld1/q;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ld1/n0$b;

    invoke-direct {v0}, Ld1/n0$b;-><init>()V

    const-string v1, "bf_key_value"

    invoke-virtual {v0, v1}, Ld1/n0$b;->h(Ljava/lang/String;)Ld1/n0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ld1/n0$b;->i(Ljava/lang/String;)Ld1/n0$b;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ld1/n0$b;->g(Ljava/lang/String;)Ld1/n0$b;

    move-result-object p1

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v1}, Ld1/n0$b;->d(Ljava/util/Date;)Ld1/n0$b;

    move-result-object p1

    iget-object v1, p0, Ld1/q1$b;->b:Ld1/q1;

    invoke-static {v1}, Ld1/q1;->Z(Ld1/q1;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Ld1/n0$b;->b(J)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Ld1/n0$b;->c(Ljava/lang/String;)Ld1/n0$b;

    move-result-object p1

    sget-object v0, Ld1/n0$c;->o:Ld1/n0$c;

    invoke-virtual {v0}, Ld1/n0$c;->e()I

    move-result v0

    invoke-virtual {p1, v0}, Ld1/n0$b;->a(I)Ld1/n0$b;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ld1/n0$b;->f(I)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1}, Ld1/n0$b;->e()Ld1/n0;

    move-result-object p1

    iget-object v0, p0, Ld1/q1$b;->b:Ld1/q1;

    invoke-static {v0, p1}, Ld1/q1;->g(Ld1/q1;Ld1/n0;)Ljava/util/concurrent/Callable;

    move-result-object p1

    iget-object v0, p0, Ld1/q1$b;->b:Ld1/q1;

    invoke-static {v0, p1}, Ld1/q1;->o(Ld1/q1;Ljava/util/concurrent/Callable;)V

    :cond_0
    return-void
.end method
