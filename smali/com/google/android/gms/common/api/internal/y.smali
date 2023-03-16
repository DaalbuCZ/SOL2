.class final Lcom/google/android/gms/common/api/internal/y;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:I

.field private final b:Lw3/b;


# direct methods
.method constructor <init>(Lw3/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lz3/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/y;->b:Lw3/b;

    iput p2, p0, Lcom/google/android/gms/common/api/internal/y;->a:I

    return-void
.end method


# virtual methods
.method final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/api/internal/y;->a:I

    return v0
.end method

.method final b()Lw3/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/y;->b:Lw3/b;

    return-object v0
.end method
