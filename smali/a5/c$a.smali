.class abstract La5/c$a;
.super La5/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, La5/c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    check-cast p1, Ljava/lang/Character;

    invoke-super {p0, p1}, La5/c;->b(Ljava/lang/Character;)Z

    move-result p1

    return p1
.end method
