.class final Lcom/google/android/gms/common/api/internal/n;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ly3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly3/b<",
            "*>;"
        }
    .end annotation
.end field

.field private final b:Lw3/d;


# direct methods
.method synthetic constructor <init>(Ly3/b;Lw3/d;Ly3/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/n;->a:Ly3/b;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/n;->b:Lw3/d;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/common/api/internal/n;)Lw3/d;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/n;->b:Lw3/d;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/common/api/internal/n;)Ly3/b;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/n;->a:Ly3/b;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    instance-of v1, p1, Lcom/google/android/gms/common/api/internal/n;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/common/api/internal/n;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/n;->a:Ly3/b;

    iget-object v2, p1, Lcom/google/android/gms/common/api/internal/n;->a:Ly3/b;

    invoke-static {v1, v2}, Lz3/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/n;->b:Lw3/d;

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/n;->b:Lw3/d;

    invoke-static {v1, p1}, Lz3/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/n;->a:Ly3/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/n;->b:Lw3/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lz3/n;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lz3/n;->c(Ljava/lang/Object;)Lz3/n$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/n;->a:Ly3/b;

    const-string v2, "key"

    invoke-virtual {v0, v2, v1}, Lz3/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lz3/n$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/n;->b:Lw3/d;

    const-string v2, "feature"

    invoke-virtual {v0, v2, v1}, Lz3/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lz3/n$a;

    move-result-object v0

    invoke-virtual {v0}, Lz3/n$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
