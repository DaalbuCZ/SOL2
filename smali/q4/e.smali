.class public final Lq4/e;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lx3/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/a$g<",
            "Lr4/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lx3/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/a$g<",
            "Lr4/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lx3/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/a$a<",
            "Lr4/a;",
            "Lq4/a;",
            ">;"
        }
    .end annotation
.end field

.field static final d:Lx3/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/a$a<",
            "Lr4/a;",
            "Lq4/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/common/api/Scope;

.field public static final g:Lx3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/a<",
            "Lq4/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lx3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/a<",
            "Lq4/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lx3/a$g;

    invoke-direct {v0}, Lx3/a$g;-><init>()V

    sput-object v0, Lq4/e;->a:Lx3/a$g;

    new-instance v1, Lx3/a$g;

    invoke-direct {v1}, Lx3/a$g;-><init>()V

    sput-object v1, Lq4/e;->b:Lx3/a$g;

    new-instance v2, Lq4/b;

    invoke-direct {v2}, Lq4/b;-><init>()V

    sput-object v2, Lq4/e;->c:Lx3/a$a;

    new-instance v3, Lq4/c;

    invoke-direct {v3}, Lq4/c;-><init>()V

    sput-object v3, Lq4/e;->d:Lx3/a$a;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "profile"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lq4/e;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "email"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lq4/e;->f:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lx3/a;

    const-string v5, "SignIn.API"

    invoke-direct {v4, v5, v2, v0}, Lx3/a;-><init>(Ljava/lang/String;Lx3/a$a;Lx3/a$g;)V

    sput-object v4, Lq4/e;->g:Lx3/a;

    new-instance v0, Lx3/a;

    const-string v2, "SignIn.INTERNAL_API"

    invoke-direct {v0, v2, v3, v1}, Lx3/a;-><init>(Ljava/lang/String;Lx3/a$a;Lx3/a$g;)V

    sput-object v0, Lq4/e;->h:Lx3/a;

    return-void
.end method
