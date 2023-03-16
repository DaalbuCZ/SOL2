.class public final Lb4/d;
.super Lx3/e;
.source ""

# interfaces
.implements Lz3/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx3/e<",
        "Lz3/v;",
        ">;",
        "Lz3/u;"
    }
.end annotation


# static fields
.field private static final k:Lx3/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/a$g<",
            "Lb4/e;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Lx3/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/a$a<",
            "Lb4/e;",
            "Lz3/v;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Lx3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/a<",
            "Lz3/v;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic n:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lx3/a$g;

    invoke-direct {v0}, Lx3/a$g;-><init>()V

    sput-object v0, Lb4/d;->k:Lx3/a$g;

    new-instance v1, Lb4/c;

    invoke-direct {v1}, Lb4/c;-><init>()V

    sput-object v1, Lb4/d;->l:Lx3/a$a;

    new-instance v2, Lx3/a;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Lx3/a;-><init>(Ljava/lang/String;Lx3/a$a;Lx3/a$g;)V

    sput-object v2, Lb4/d;->m:Lx3/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lz3/v;)V
    .locals 2

    sget-object v0, Lb4/d;->m:Lx3/a;

    sget-object v1, Lx3/e$a;->c:Lx3/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lx3/e;-><init>(Landroid/content/Context;Lx3/a;Lx3/a$d;Lx3/e$a;)V

    return-void
.end method


# virtual methods
.method public final a(Lz3/s;)Lt4/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz3/s;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/api/internal/c;->a()Lcom/google/android/gms/common/api/internal/c$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lw3/d;

    sget-object v2, Lj4/d;->a:Lw3/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/c$a;->d([Lw3/d;)Lcom/google/android/gms/common/api/internal/c$a;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/api/internal/c$a;->c(Z)Lcom/google/android/gms/common/api/internal/c$a;

    new-instance v1, Lb4/b;

    invoke-direct {v1, p1}, Lb4/b;-><init>(Lz3/s;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/c$a;->b(Ly3/j;)Lcom/google/android/gms/common/api/internal/c$a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/c$a;->a()Lcom/google/android/gms/common/api/internal/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx3/e;->c(Lcom/google/android/gms/common/api/internal/c;)Lt4/i;

    move-result-object p1

    return-object p1
.end method
