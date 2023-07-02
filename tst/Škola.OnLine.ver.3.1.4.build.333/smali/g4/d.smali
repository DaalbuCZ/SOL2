.class public final Lg4/d;
.super Lc4/e;
.source ""

# interfaces
.implements Le4/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc4/e<",
        "Le4/v;",
        ">;",
        "Le4/u;"
    }
.end annotation


# static fields
.field private static final k:Lc4/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a$g<",
            "Lg4/e;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Lc4/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a$a<",
            "Lg4/e;",
            "Le4/v;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Lc4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a<",
            "Le4/v;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic n:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lc4/a$g;

    invoke-direct {v0}, Lc4/a$g;-><init>()V

    sput-object v0, Lg4/d;->k:Lc4/a$g;

    new-instance v1, Lg4/c;

    invoke-direct {v1}, Lg4/c;-><init>()V

    sput-object v1, Lg4/d;->l:Lc4/a$a;

    new-instance v2, Lc4/a;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Lc4/a;-><init>(Ljava/lang/String;Lc4/a$a;Lc4/a$g;)V

    sput-object v2, Lg4/d;->m:Lc4/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le4/v;)V
    .locals 2

    sget-object v0, Lg4/d;->m:Lc4/a;

    sget-object v1, Lc4/e$a;->c:Lc4/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lc4/e;-><init>(Landroid/content/Context;Lc4/a;Lc4/a$d;Lc4/e$a;)V

    return-void
.end method


# virtual methods
.method public final a(Le4/s;)Ly4/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/s;",
            ")",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/api/internal/c;->a()Lcom/google/android/gms/common/api/internal/c$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lb4/d;

    sget-object v2, Lo4/d;->a:Lb4/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/c$a;->d([Lb4/d;)Lcom/google/android/gms/common/api/internal/c$a;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/api/internal/c$a;->c(Z)Lcom/google/android/gms/common/api/internal/c$a;

    new-instance v1, Lg4/b;

    invoke-direct {v1, p1}, Lg4/b;-><init>(Le4/s;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/c$a;->b(Ld4/j;)Lcom/google/android/gms/common/api/internal/c$a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/c$a;->a()Lcom/google/android/gms/common/api/internal/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc4/e;->c(Lcom/google/android/gms/common/api/internal/c;)Ly4/i;

    move-result-object p1

    return-object p1
.end method
