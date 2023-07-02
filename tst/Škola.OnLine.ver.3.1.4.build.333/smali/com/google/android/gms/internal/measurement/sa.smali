.class final Lcom/google/android/gms/internal/measurement/sa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/za;


# instance fields
.field private final a:Lcom/google/android/gms/internal/measurement/oa;

.field private final b:Lcom/google/android/gms/internal/measurement/rb;

.field private final c:Z

.field private final d:Lcom/google/android/gms/internal/measurement/v8;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/rb;Lcom/google/android/gms/internal/measurement/v8;Lcom/google/android/gms/internal/measurement/oa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/sa;->b:Lcom/google/android/gms/internal/measurement/rb;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/v8;->c(Lcom/google/android/gms/internal/measurement/oa;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/sa;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/sa;->d:Lcom/google/android/gms/internal/measurement/v8;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/sa;->a:Lcom/google/android/gms/internal/measurement/oa;

    return-void
.end method

.method static j(Lcom/google/android/gms/internal/measurement/rb;Lcom/google/android/gms/internal/measurement/v8;Lcom/google/android/gms/internal/measurement/oa;)Lcom/google/android/gms/internal/measurement/sa;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/sa;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/sa;-><init>(Lcom/google/android/gms/internal/measurement/rb;Lcom/google/android/gms/internal/measurement/v8;Lcom/google/android/gms/internal/measurement/oa;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->b:Lcom/google/android/gms/internal/measurement/rb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/rb;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->d:Lcom/google/android/gms/internal/measurement/v8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/v8;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->b:Lcom/google/android/gms/internal/measurement/rb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/rb;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/rb;->b(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/sa;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->d:Lcom/google/android/gms/internal/measurement/v8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/v8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/z8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->b:Lcom/google/android/gms/internal/measurement/rb;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/bb;->f(Lcom/google/android/gms/internal/measurement/rb;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/sa;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->d:Lcom/google/android/gms/internal/measurement/v8;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/bb;->e(Lcom/google/android/gms/internal/measurement/v8;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/kc;)V
    .locals 0

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/sa;->d:Lcom/google/android/gms/internal/measurement/v8;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/v8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/z8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final e()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->a:Lcom/google/android/gms/internal/measurement/oa;

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/i9;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/measurement/i9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/i9;->k()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/oa;->h()Lcom/google/android/gms/internal/measurement/na;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/na;->n()Lcom/google/android/gms/internal/measurement/oa;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/t7;)V
    .locals 0

    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/measurement/i9;

    iget-object p3, p2, Lcom/google/android/gms/internal/measurement/i9;->zzc:Lcom/google/android/gms/internal/measurement/sb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/sb;->c()Lcom/google/android/gms/internal/measurement/sb;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/sb;->f()Lcom/google/android/gms/internal/measurement/sb;

    move-result-object p3

    iput-object p3, p2, Lcom/google/android/gms/internal/measurement/i9;->zzc:Lcom/google/android/gms/internal/measurement/sb;

    :goto_0
    check-cast p1, Lcom/google/android/gms/internal/measurement/g9;

    const/4 p1, 0x0

    throw p1
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->b:Lcom/google/android/gms/internal/measurement/rb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/rb;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/sa;->b:Lcom/google/android/gms/internal/measurement/rb;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/measurement/rb;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/sa;->c:Z

    if-nez v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->d:Lcom/google/android/gms/internal/measurement/v8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/v8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/z8;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/sa;->d:Lcom/google/android/gms/internal/measurement/v8;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/v8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/z8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final h(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->d:Lcom/google/android/gms/internal/measurement/v8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/v8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/z8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final i(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->b:Lcom/google/android/gms/internal/measurement/rb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/rb;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/sa;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sa;->d:Lcom/google/android/gms/internal/measurement/v8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/v8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/z8;

    const/4 p1, 0x0

    throw p1
.end method
