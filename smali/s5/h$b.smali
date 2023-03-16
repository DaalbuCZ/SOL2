.class final Ls5/h$b;
.super Ls5/b0$e$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/Long;

.field private d:Ljava/lang/Long;

.field private e:Ljava/lang/Boolean;

.field private f:Ls5/b0$e$a;

.field private g:Ls5/b0$e$f;

.field private h:Ls5/b0$e$e;

.field private i:Ls5/b0$e$c;

.field private j:Ls5/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls5/c0<",
            "Ls5/b0$e$d;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/lang/Integer;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ls5/b0$e$b;-><init>()V

    return-void
.end method

.method private constructor <init>(Ls5/b0$e;)V
    .locals 2

    invoke-direct {p0}, Ls5/b0$e$b;-><init>()V

    invoke-virtual {p1}, Ls5/b0$e;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls5/h$b;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ls5/b0$e;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls5/h$b;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ls5/b0$e;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ls5/h$b;->c:Ljava/lang/Long;

    invoke-virtual {p1}, Ls5/b0$e;->d()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ls5/h$b;->d:Ljava/lang/Long;

    invoke-virtual {p1}, Ls5/b0$e;->m()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ls5/h$b;->e:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ls5/b0$e;->b()Ls5/b0$e$a;

    move-result-object v0

    iput-object v0, p0, Ls5/h$b;->f:Ls5/b0$e$a;

    invoke-virtual {p1}, Ls5/b0$e;->l()Ls5/b0$e$f;

    move-result-object v0

    iput-object v0, p0, Ls5/h$b;->g:Ls5/b0$e$f;

    invoke-virtual {p1}, Ls5/b0$e;->j()Ls5/b0$e$e;

    move-result-object v0

    iput-object v0, p0, Ls5/h$b;->h:Ls5/b0$e$e;

    invoke-virtual {p1}, Ls5/b0$e;->c()Ls5/b0$e$c;

    move-result-object v0

    iput-object v0, p0, Ls5/h$b;->i:Ls5/b0$e$c;

    invoke-virtual {p1}, Ls5/b0$e;->e()Ls5/c0;

    move-result-object v0

    iput-object v0, p0, Ls5/h$b;->j:Ls5/c0;

    invoke-virtual {p1}, Ls5/b0$e;->g()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ls5/h$b;->k:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Ls5/b0$e;Ls5/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls5/h$b;-><init>(Ls5/b0$e;)V

    return-void
.end method


# virtual methods
.method public a()Ls5/b0$e;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Ls5/h$b;->a:Ljava/lang/String;

    const-string v2, ""

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " generator"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_0
    iget-object v1, v0, Ls5/h$b;->b:Ljava/lang/String;

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " identifier"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    iget-object v1, v0, Ls5/h$b;->c:Ljava/lang/Long;

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " startedAt"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    iget-object v1, v0, Ls5/h$b;->e:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " crashed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_3
    iget-object v1, v0, Ls5/h$b;->f:Ls5/b0$e$a;

    if-nez v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " app"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_4
    iget-object v1, v0, Ls5/h$b;->k:Ljava/lang/Integer;

    if-nez v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " generatorType"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ls5/h;

    iget-object v4, v0, Ls5/h$b;->a:Ljava/lang/String;

    iget-object v5, v0, Ls5/h$b;->b:Ljava/lang/String;

    iget-object v2, v0, Ls5/h$b;->c:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v8, v0, Ls5/h$b;->d:Ljava/lang/Long;

    iget-object v2, v0, Ls5/h$b;->e:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    iget-object v10, v0, Ls5/h$b;->f:Ls5/b0$e$a;

    iget-object v11, v0, Ls5/h$b;->g:Ls5/b0$e$f;

    iget-object v12, v0, Ls5/h$b;->h:Ls5/b0$e$e;

    iget-object v13, v0, Ls5/h$b;->i:Ls5/b0$e$c;

    iget-object v14, v0, Ls5/h$b;->j:Ls5/c0;

    iget-object v2, v0, Ls5/h$b;->k:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v15

    const/16 v16, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, Ls5/h;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLs5/b0$e$a;Ls5/b0$e$f;Ls5/b0$e$e;Ls5/b0$e$c;Ls5/c0;ILs5/h$a;)V

    return-object v1

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(Ls5/b0$e$a;)Ls5/b0$e$b;
    .locals 1

    const-string v0, "Null app"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ls5/h$b;->f:Ls5/b0$e$a;

    return-object p0
.end method

.method public c(Z)Ls5/b0$e$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ls5/h$b;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public d(Ls5/b0$e$c;)Ls5/b0$e$b;
    .locals 0

    iput-object p1, p0, Ls5/h$b;->i:Ls5/b0$e$c;

    return-object p0
.end method

.method public e(Ljava/lang/Long;)Ls5/b0$e$b;
    .locals 0

    iput-object p1, p0, Ls5/h$b;->d:Ljava/lang/Long;

    return-object p0
.end method

.method public f(Ls5/c0;)Ls5/b0$e$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls5/c0<",
            "Ls5/b0$e$d;",
            ">;)",
            "Ls5/b0$e$b;"
        }
    .end annotation

    iput-object p1, p0, Ls5/h$b;->j:Ls5/c0;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Ls5/b0$e$b;
    .locals 1

    const-string v0, "Null generator"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ls5/h$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public h(I)Ls5/b0$e$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ls5/h$b;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public i(Ljava/lang/String;)Ls5/b0$e$b;
    .locals 1

    const-string v0, "Null identifier"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ls5/h$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public k(Ls5/b0$e$e;)Ls5/b0$e$b;
    .locals 0

    iput-object p1, p0, Ls5/h$b;->h:Ls5/b0$e$e;

    return-object p0
.end method

.method public l(J)Ls5/b0$e$b;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ls5/h$b;->c:Ljava/lang/Long;

    return-object p0
.end method

.method public m(Ls5/b0$e$f;)Ls5/b0$e$b;
    .locals 0

    iput-object p1, p0, Ls5/h$b;->g:Ls5/b0$e$f;

    return-object p0
.end method
