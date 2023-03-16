.class public final Lv9/c;
.super Ld9/d;
.source ""

# interfaces
.implements Lu9/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ld9/d;",
        "Lu9/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final q:Lu9/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final r:Lb9/g;

.field public final s:I

.field private t:Lb9/g;

.field private u:Lb9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu9/c;Lb9/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu9/c<",
            "-TT;>;",
            "Lb9/g;",
            ")V"
        }
    .end annotation

    sget-object v0, Lv9/b;->n:Lv9/b;

    sget-object v1, Lb9/h;->n:Lb9/h;

    invoke-direct {p0, v0, v1}, Ld9/d;-><init>(Lb9/d;Lb9/g;)V

    iput-object p1, p0, Lv9/c;->q:Lu9/c;

    iput-object p2, p0, Lv9/c;->r:Lb9/g;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object v0, Lv9/c$a;->o:Lv9/c$a;

    invoke-interface {p2, p1, v0}, Lb9/g;->S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, Lv9/c;->s:I

    return-void
.end method

.method private final v(Lb9/g;Lb9/g;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/g;",
            "Lb9/g;",
            "TT;)V"
        }
    .end annotation

    instance-of v0, p2, Lv9/a;

    if-eqz v0, :cond_0

    check-cast p2, Lv9/a;

    invoke-direct {p0, p2, p3}, Lv9/c;->x(Lv9/a;Ljava/lang/Object;)V

    :cond_0
    invoke-static {p0, p1}, Lv9/e;->a(Lv9/c;Lb9/g;)V

    return-void
.end method

.method private final w(Lb9/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1}, Lb9/d;->b()Lb9/g;

    move-result-object v0

    invoke-static {v0}, Lr9/t1;->d(Lb9/g;)V

    iget-object v1, p0, Lv9/c;->t:Lb9/g;

    if-eq v1, v0, :cond_0

    invoke-direct {p0, v0, v1, p2}, Lv9/c;->v(Lb9/g;Lb9/g;Ljava/lang/Object;)V

    iput-object v0, p0, Lv9/c;->t:Lb9/g;

    :cond_0
    iput-object p1, p0, Lv9/c;->u:Lb9/d;

    invoke-static {}, Lv9/d;->a()Lj9/q;

    move-result-object p1

    iget-object v0, p0, Lv9/c;->q:Lu9/c;

    invoke-interface {p1, v0, p2, p0}, Lj9/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lc9/b;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lk9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, Lv9/c;->u:Lb9/d;

    :cond_1
    return-object p1
.end method

.method private final x(Lv9/a;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lv9/a;->n:Ljava/lang/Throwable;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", but then emission attempt of value \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lq9/d;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lb9/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p2, p1}, Lv9/c;->w(Lb9/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lc9/b;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Ld9/h;->c(Lb9/d;)V

    :cond_0
    invoke-static {}, Lc9/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ly8/s;->a:Ly8/s;

    return-object p1

    :catchall_0
    move-exception p1

    new-instance v0, Lv9/a;

    invoke-interface {p2}, Lb9/d;->b()Lb9/g;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lv9/a;-><init>(Ljava/lang/Throwable;Lb9/g;)V

    iput-object v0, p0, Lv9/c;->t:Lb9/g;

    throw p1
.end method

.method public b()Lb9/g;
    .locals 1

    iget-object v0, p0, Lv9/c;->t:Lb9/g;

    if-nez v0, :cond_0

    sget-object v0, Lb9/h;->n:Lb9/h;

    :cond_0
    return-object v0
.end method

.method public h()Ld9/e;
    .locals 2

    iget-object v0, p0, Lv9/c;->u:Lb9/d;

    instance-of v1, v0, Ld9/e;

    if-eqz v1, :cond_0

    check-cast v0, Ld9/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public n()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Ly8/m;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lv9/a;

    invoke-virtual {p0}, Lv9/c;->b()Lb9/g;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lv9/a;-><init>(Ljava/lang/Throwable;Lb9/g;)V

    iput-object v1, p0, Lv9/c;->t:Lb9/g;

    :cond_0
    iget-object v0, p0, Lv9/c;->u:Lb9/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lb9/d;->l(Ljava/lang/Object;)V

    :cond_1
    invoke-static {}, Lc9/b;->c()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public t()V
    .locals 0

    invoke-super {p0}, Ld9/d;->t()V

    return-void
.end method
