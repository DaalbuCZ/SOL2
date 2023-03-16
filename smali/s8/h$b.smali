.class Ls8/h$b;
.super Ll8/r;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field public static final d:Ls8/h$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls8/h$b;

    invoke-direct {v0}, Ls8/h$b;-><init>()V

    sput-object v0, Ls8/h$b;->d:Ls8/h$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll8/r;-><init>()V

    return-void
.end method
