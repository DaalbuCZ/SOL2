.class public final Li0/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Li0/h;",
        ">;"
    }
.end annotation


# static fields
.field public static final s:Li0/h$a;

.field private static final t:Li0/h;

.field private static final u:Li0/h;

.field private static final v:Li0/h;

.field private static final w:Li0/h;


# instance fields
.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:Ljava/lang/String;

.field private final r:Ly8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li0/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li0/h$a;-><init>(Lk9/g;)V

    sput-object v0, Li0/h;->s:Li0/h$a;

    new-instance v0, Li0/h;

    const/4 v1, 0x0

    const-string v2, ""

    invoke-direct {v0, v1, v1, v1, v2}, Li0/h;-><init>(IIILjava/lang/String;)V

    sput-object v0, Li0/h;->t:Li0/h;

    new-instance v0, Li0/h;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v1, v2}, Li0/h;-><init>(IIILjava/lang/String;)V

    sput-object v0, Li0/h;->u:Li0/h;

    new-instance v0, Li0/h;

    invoke-direct {v0, v3, v1, v1, v2}, Li0/h;-><init>(IIILjava/lang/String;)V

    sput-object v0, Li0/h;->v:Li0/h;

    sput-object v0, Li0/h;->w:Li0/h;

    return-void
.end method

.method private constructor <init>(IIILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li0/h;->n:I

    iput p2, p0, Li0/h;->o:I

    iput p3, p0, Li0/h;->p:I

    iput-object p4, p0, Li0/h;->q:Ljava/lang/String;

    new-instance p1, Li0/h$b;

    invoke-direct {p1, p0}, Li0/h$b;-><init>(Li0/h;)V

    invoke-static {p1}, Ly8/h;->a(Lj9/a;)Ly8/g;

    move-result-object p1

    iput-object p1, p0, Li0/h;->r:Ly8/g;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Lk9/g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Li0/h;-><init>(IIILjava/lang/String;)V

    return-void
.end method

.method public static final synthetic e()Li0/h;
    .locals 1

    sget-object v0, Li0/h;->u:Li0/h;

    return-object v0
.end method

.method private final h()Ljava/math/BigInteger;
    .locals 2

    iget-object v0, p0, Li0/h;->r:Ly8/g;

    invoke-interface {v0}, Ly8/g;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-bigInteger>(...)"

    invoke-static {v0, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/math/BigInteger;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Li0/h;

    invoke-virtual {p0, p1}, Li0/h;->g(Li0/h;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Li0/h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Li0/h;->n:I

    check-cast p1, Li0/h;

    iget v2, p1, Li0/h;->n:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Li0/h;->o:I

    iget v2, p1, Li0/h;->o:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Li0/h;->p:I

    iget p1, p1, Li0/h;->p:I

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public g(Li0/h;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Li0/h;->h()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {p1}, Li0/h;->h()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Li0/h;->n:I

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Li0/h;->o:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Li0/h;->p:I

    add-int/2addr v1, v0

    return v1
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Li0/h;->n:I

    return v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Li0/h;->o:I

    return v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Li0/h;->p:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Li0/h;->q:Ljava/lang/String;

    invoke-static {v0}, Lq9/d;->h(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Li0/h;->q:Ljava/lang/String;

    const-string v1, "-"

    invoke-static {v1, v0}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Li0/h;->n:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v3, p0, Li0/h;->o:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Li0/h;->p:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
