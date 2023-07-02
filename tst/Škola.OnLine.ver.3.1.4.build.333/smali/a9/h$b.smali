.class La9/h$b;
.super Lt8/r;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field public static final d:La9/h$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La9/h$b;

    invoke-direct {v0}, La9/h$b;-><init>()V

    sput-object v0, La9/h$b;->d:La9/h$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lt8/r;-><init>()V

    return-void
.end method
