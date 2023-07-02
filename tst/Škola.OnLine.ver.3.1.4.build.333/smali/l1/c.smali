.class final Ll1/c;
.super Ll1/o;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/c$b;
    }
.end annotation


# instance fields
.field private final a:Ll1/p;

.field private final b:Ljava/lang/String;

.field private final c:Lj1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj1/c<",
            "*>;"
        }
    .end annotation
.end field

.field private final d:Lj1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj1/e<",
            "*[B>;"
        }
    .end annotation
.end field

.field private final e:Lj1/b;


# direct methods
.method private constructor <init>(Ll1/p;Ljava/lang/String;Lj1/c;Lj1/e;Lj1/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/p;",
            "Ljava/lang/String;",
            "Lj1/c<",
            "*>;",
            "Lj1/e<",
            "*[B>;",
            "Lj1/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ll1/o;-><init>()V

    iput-object p1, p0, Ll1/c;->a:Ll1/p;

    iput-object p2, p0, Ll1/c;->b:Ljava/lang/String;

    iput-object p3, p0, Ll1/c;->c:Lj1/c;

    iput-object p4, p0, Ll1/c;->d:Lj1/e;

    iput-object p5, p0, Ll1/c;->e:Lj1/b;

    return-void
.end method

.method synthetic constructor <init>(Ll1/p;Ljava/lang/String;Lj1/c;Lj1/e;Lj1/b;Ll1/c$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ll1/c;-><init>(Ll1/p;Ljava/lang/String;Lj1/c;Lj1/e;Lj1/b;)V

    return-void
.end method


# virtual methods
.method public b()Lj1/b;
    .locals 1

    iget-object v0, p0, Ll1/c;->e:Lj1/b;

    return-object v0
.end method

.method c()Lj1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj1/c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Ll1/c;->c:Lj1/c;

    return-object v0
.end method

.method e()Lj1/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj1/e<",
            "*[B>;"
        }
    .end annotation

    iget-object v0, p0, Ll1/c;->d:Lj1/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll1/o;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Ll1/o;

    iget-object v1, p0, Ll1/c;->a:Ll1/p;

    invoke-virtual {p1}, Ll1/o;->f()Ll1/p;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll1/c;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ll1/o;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll1/c;->c:Lj1/c;

    invoke-virtual {p1}, Ll1/o;->c()Lj1/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll1/c;->d:Lj1/e;

    invoke-virtual {p1}, Ll1/o;->e()Lj1/e;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll1/c;->e:Lj1/b;

    invoke-virtual {p1}, Ll1/o;->b()Lj1/b;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj1/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public f()Ll1/p;
    .locals 1

    iget-object v0, p0, Ll1/c;->a:Ll1/p;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll1/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ll1/c;->a:Ll1/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Ll1/c;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ll1/c;->c:Lj1/c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ll1/c;->d:Lj1/e;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ll1/c;->e:Lj1/b;

    invoke-virtual {v1}, Lj1/b;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SendRequest{transportContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/c;->a:Ll1/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transportName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", event="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/c;->c:Lj1/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/c;->d:Lj1/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", encoding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/c;->e:Lj1/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
