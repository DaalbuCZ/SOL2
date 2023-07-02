.class public final Ld4/u;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/google/android/gms/common/api/internal/x;

.field public final b:I

.field public final c:Lc4/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/e<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/x;ILc4/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/x;",
            "I",
            "Lc4/e<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/u;->a:Lcom/google/android/gms/common/api/internal/x;

    iput p2, p0, Ld4/u;->b:I

    iput-object p3, p0, Ld4/u;->c:Lc4/e;

    return-void
.end method
