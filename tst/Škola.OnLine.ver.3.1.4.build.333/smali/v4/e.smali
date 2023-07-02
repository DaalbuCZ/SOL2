.class public final Lv4/e;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lc4/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a$g<",
            "Lw4/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lc4/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a$g<",
            "Lw4/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lc4/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a$a<",
            "Lw4/a;",
            "Lv4/a;",
            ">;"
        }
    .end annotation
.end field

.field static final d:Lc4/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a$a<",
            "Lw4/a;",
            "Lv4/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/common/api/Scope;

.field public static final g:Lc4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a<",
            "Lv4/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lc4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a<",
            "Lv4/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lc4/a$g;

    invoke-direct {v0}, Lc4/a$g;-><init>()V

    sput-object v0, Lv4/e;->a:Lc4/a$g;

    new-instance v1, Lc4/a$g;

    invoke-direct {v1}, Lc4/a$g;-><init>()V

    sput-object v1, Lv4/e;->b:Lc4/a$g;

    new-instance v2, Lv4/b;

    invoke-direct {v2}, Lv4/b;-><init>()V

    sput-object v2, Lv4/e;->c:Lc4/a$a;

    new-instance v3, Lv4/c;

    invoke-direct {v3}, Lv4/c;-><init>()V

    sput-object v3, Lv4/e;->d:Lc4/a$a;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "profile"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lv4/e;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "email"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lv4/e;->f:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lc4/a;

    const-string v5, "SignIn.API"

    invoke-direct {v4, v5, v2, v0}, Lc4/a;-><init>(Ljava/lang/String;Lc4/a$a;Lc4/a$g;)V

    sput-object v4, Lv4/e;->g:Lc4/a;

    new-instance v0, Lc4/a;

    const-string v2, "SignIn.INTERNAL_API"

    invoke-direct {v0, v2, v3, v1}, Lc4/a;-><init>(Ljava/lang/String;Lc4/a$a;Lc4/a$g;)V

    sput-object v0, Lv4/e;->h:Lc4/a;

    return-void
.end method
