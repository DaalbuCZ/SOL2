.class public final synthetic Lo1/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo1/m0$b;


# static fields
.field public static final synthetic a:Lo1/t;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo1/t;

    invoke-direct {v0}, Lo1/t;-><init>()V

    sput-object v0, Lo1/t;->a:Lo1/t;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-static {p1}, Lo1/m0;->B(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
