.class public final Ll7/d;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Z

.field public static final b:Li7/d$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/d$b<",
            "+",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Li7/d$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/d$b<",
            "+",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lf7/x;

.field public static final e:Lf7/x;

.field public static final f:Lf7/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    :try_start_0
    const-string v0, "java.sql.Date"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ll7/d;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Ll7/d$a;

    const-class v1, Ljava/sql/Date;

    invoke-direct {v0, v1}, Ll7/d$a;-><init>(Ljava/lang/Class;)V

    sput-object v0, Ll7/d;->b:Li7/d$b;

    new-instance v0, Ll7/d$b;

    const-class v1, Ljava/sql/Timestamp;

    invoke-direct {v0, v1}, Ll7/d$b;-><init>(Ljava/lang/Class;)V

    sput-object v0, Ll7/d;->c:Li7/d$b;

    sget-object v0, Ll7/a;->b:Lf7/x;

    sput-object v0, Ll7/d;->d:Lf7/x;

    sget-object v0, Ll7/b;->b:Lf7/x;

    sput-object v0, Ll7/d;->e:Lf7/x;

    sget-object v0, Ll7/c;->b:Lf7/x;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Ll7/d;->b:Li7/d$b;

    sput-object v0, Ll7/d;->c:Li7/d$b;

    sput-object v0, Ll7/d;->d:Lf7/x;

    sput-object v0, Ll7/d;->e:Lf7/x;

    :goto_1
    sput-object v0, Ll7/d;->f:Lf7/x;

    return-void
.end method
