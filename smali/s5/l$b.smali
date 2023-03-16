.class final Ls5/l$b;
.super Ls5/b0$e$d$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls5/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Ljava/lang/String;

.field private c:Ls5/b0$e$d$a;

.field private d:Ls5/b0$e$d$c;

.field private e:Ls5/b0$e$d$d;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ls5/b0$e$d$b;-><init>()V

    return-void
.end method

.method private constructor <init>(Ls5/b0$e$d;)V
    .locals 2

    invoke-direct {p0}, Ls5/b0$e$d$b;-><init>()V

    invoke-virtual {p1}, Ls5/b0$e$d;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ls5/l$b;->a:Ljava/lang/Long;

    invoke-virtual {p1}, Ls5/b0$e$d;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls5/l$b;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ls5/b0$e$d;->b()Ls5/b0$e$d$a;

    move-result-object v0

    iput-object v0, p0, Ls5/l$b;->c:Ls5/b0$e$d$a;

    invoke-virtual {p1}, Ls5/b0$e$d;->c()Ls5/b0$e$d$c;

    move-result-object v0

    iput-object v0, p0, Ls5/l$b;->d:Ls5/b0$e$d$c;

    invoke-virtual {p1}, Ls5/b0$e$d;->d()Ls5/b0$e$d$d;

    move-result-object p1

    iput-object p1, p0, Ls5/l$b;->e:Ls5/b0$e$d$d;

    return-void
.end method

.method synthetic constructor <init>(Ls5/b0$e$d;Ls5/l$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls5/l$b;-><init>(Ls5/b0$e$d;)V

    return-void
.end method


# virtual methods
.method public a()Ls5/b0$e$d;
    .locals 10

    iget-object v0, p0, Ls5/l$b;->a:Ljava/lang/Long;

    const-string v1, ""

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " timestamp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object v0, p0, Ls5/l$b;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    iget-object v0, p0, Ls5/l$b;->c:Ls5/b0$e$d$a;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " app"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    iget-object v0, p0, Ls5/l$b;->d:Ls5/b0$e$d$c;

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " device"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ls5/l;

    iget-object v1, p0, Ls5/l$b;->a:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v5, p0, Ls5/l$b;->b:Ljava/lang/String;

    iget-object v6, p0, Ls5/l$b;->c:Ls5/b0$e$d$a;

    iget-object v7, p0, Ls5/l$b;->d:Ls5/b0$e$d$c;

    iget-object v8, p0, Ls5/l$b;->e:Ls5/b0$e$d$d;

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Ls5/l;-><init>(JLjava/lang/String;Ls5/b0$e$d$a;Ls5/b0$e$d$c;Ls5/b0$e$d$d;Ls5/l$a;)V

    return-object v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Ls5/b0$e$d$a;)Ls5/b0$e$d$b;
    .locals 1

    const-string v0, "Null app"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ls5/l$b;->c:Ls5/b0$e$d$a;

    return-object p0
.end method

.method public c(Ls5/b0$e$d$c;)Ls5/b0$e$d$b;
    .locals 1

    const-string v0, "Null device"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ls5/l$b;->d:Ls5/b0$e$d$c;

    return-object p0
.end method

.method public d(Ls5/b0$e$d$d;)Ls5/b0$e$d$b;
    .locals 0

    iput-object p1, p0, Ls5/l$b;->e:Ls5/b0$e$d$d;

    return-object p0
.end method

.method public e(J)Ls5/b0$e$d$b;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ls5/l$b;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Ls5/b0$e$d$b;
    .locals 1

    const-string v0, "Null type"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ls5/l$b;->b:Ljava/lang/String;

    return-object p0
.end method
