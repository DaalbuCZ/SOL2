.class final Lf5/c$d;
.super Lf5/c$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# static fields
.field static final o:Lf5/c$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf5/c$d;

    invoke-direct {v0}, Lf5/c$d;-><init>()V

    sput-object v0, Lf5/c$d;->o:Lf5/c$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.none()"

    invoke-direct {p0, v0}, Lf5/c$c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/CharSequence;I)I
    .locals 0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-static {p2, p1}, Lf5/k;->k(II)I

    const/4 p1, -0x1

    return p1
.end method

.method public e(C)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
