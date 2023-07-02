.class public final Ly9/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements Lj$/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly9/c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lv9/c;",
        ">;",
        "Lj$/util/Iterator;"
    }
.end annotation


# instance fields
.field private n:I

.field private o:I

.field private p:I

.field private q:Lv9/c;

.field private r:I

.field final synthetic s:Ly9/c;


# direct methods
.method constructor <init>(Ly9/c;)V
    .locals 2

    iput-object p1, p0, Ly9/c$a;->s:Ly9/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ly9/c$a;->n:I

    invoke-static {p1}, Ly9/c;->d(Ly9/c;)I

    move-result v0

    invoke-static {p1}, Ly9/c;->b(Ly9/c;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lv9/d;->e(III)I

    move-result p1

    iput p1, p0, Ly9/c$a;->o:I

    iput p1, p0, Ly9/c$a;->p:I

    return-void
.end method

.method private final b()V
    .locals 6

    iget v0, p0, Ly9/c$a;->p:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iput v1, p0, Ly9/c$a;->n:I

    const/4 v0, 0x0

    iput-object v0, p0, Ly9/c$a;->q:Lv9/c;

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Ly9/c$a;->s:Ly9/c;

    invoke-static {v0}, Ly9/c;->c(Ly9/c;)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-lez v0, :cond_1

    iget v0, p0, Ly9/c$a;->r:I

    add-int/2addr v0, v3

    iput v0, p0, Ly9/c$a;->r:I

    iget-object v4, p0, Ly9/c$a;->s:Ly9/c;

    invoke-static {v4}, Ly9/c;->c(Ly9/c;)I

    move-result v4

    if-ge v0, v4, :cond_2

    :cond_1
    iget v0, p0, Ly9/c$a;->p:I

    iget-object v4, p0, Ly9/c$a;->s:Ly9/c;

    invoke-static {v4}, Ly9/c;->b(Ly9/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v0, v4, :cond_3

    :cond_2
    new-instance v0, Lv9/c;

    iget v1, p0, Ly9/c$a;->o:I

    iget-object v4, p0, Ly9/c$a;->s:Ly9/c;

    invoke-static {v4}, Ly9/c;->b(Ly9/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Ly9/n;->q(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, Lv9/c;-><init>(II)V

    :goto_0
    iput-object v0, p0, Ly9/c$a;->q:Lv9/c;

    :goto_1
    iput v2, p0, Ly9/c$a;->p:I

    goto :goto_2

    :cond_3
    iget-object v0, p0, Ly9/c$a;->s:Ly9/c;

    invoke-static {v0}, Ly9/c;->a(Ly9/c;)Lr9/p;

    move-result-object v0

    iget-object v4, p0, Ly9/c$a;->s:Ly9/c;

    invoke-static {v4}, Ly9/c;->b(Ly9/c;)Ljava/lang/CharSequence;

    move-result-object v4

    iget v5, p0, Ly9/c$a;->p:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Lr9/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg9/l;

    if-nez v0, :cond_4

    new-instance v0, Lv9/c;

    iget v1, p0, Ly9/c$a;->o:I

    iget-object v4, p0, Ly9/c$a;->s:Ly9/c;

    invoke-static {v4}, Ly9/c;->b(Ly9/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Ly9/n;->q(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, Lv9/c;-><init>(II)V

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lg9/l;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0}, Lg9/l;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v4, p0, Ly9/c$a;->o:I

    invoke-static {v4, v2}, Lv9/d;->g(II)Lv9/c;

    move-result-object v4

    iput-object v4, p0, Ly9/c$a;->q:Lv9/c;

    add-int/2addr v2, v0

    iput v2, p0, Ly9/c$a;->o:I

    if-nez v0, :cond_5

    move v1, v3

    :cond_5
    add-int/2addr v2, v1

    goto :goto_1

    :goto_2
    iput v3, p0, Ly9/c$a;->n:I

    :goto_3
    return-void
.end method


# virtual methods
.method public c()Lv9/c;
    .locals 3

    iget v0, p0, Ly9/c$a;->n:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Ly9/c$a;->b()V

    :cond_0
    iget v0, p0, Ly9/c$a;->n:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Ly9/c$a;->q:Lv9/c;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v0, v2}, Ls9/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, p0, Ly9/c$a;->q:Lv9/c;

    iput v1, p0, Ly9/c$a;->n:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Iterator$-CC;->$default$forEachRemaining(Ljava/util/Iterator;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Ly9/c$a;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Ly9/c$a;->n:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Ly9/c$a;->b()V

    :cond_0
    iget v0, p0, Ly9/c$a;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly9/c$a;->c()Lv9/c;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
