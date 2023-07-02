.class Lr3/f$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static final c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lr3/f$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lr3/f$c;

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lr3/g;->n:Lr3/g;

    sput-object v0, Lr3/f$b;->c:Ljava/util/Comparator;

    return-void
.end method

.method private constructor <init>(Lr3/f$c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr3/f$b;->a:Lr3/f$c;

    iput p2, p0, Lr3/f$b;->b:I

    return-void
.end method

.method synthetic constructor <init>(Lr3/f$c;ILr3/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr3/f$b;-><init>(Lr3/f$c;I)V

    return-void
.end method

.method public static synthetic a(Lr3/f$b;Lr3/f$b;)I
    .locals 0

    invoke-static {p0, p1}, Lr3/f$b;->e(Lr3/f$b;Lr3/f$b;)I

    move-result p0

    return p0
.end method

.method static synthetic b()Ljava/util/Comparator;
    .locals 1

    sget-object v0, Lr3/f$b;->c:Ljava/util/Comparator;

    return-object v0
.end method

.method static synthetic c(Lr3/f$b;)Lr3/f$c;
    .locals 0

    iget-object p0, p0, Lr3/f$b;->a:Lr3/f$c;

    return-object p0
.end method

.method static synthetic d(Lr3/f$b;)I
    .locals 0

    iget p0, p0, Lr3/f$b;->b:I

    return p0
.end method

.method private static synthetic e(Lr3/f$b;Lr3/f$b;)I
    .locals 0

    iget-object p0, p0, Lr3/f$b;->a:Lr3/f$c;

    iget p0, p0, Lr3/f$c;->b:I

    iget-object p1, p1, Lr3/f$b;->a:Lr3/f$c;

    iget p1, p1, Lr3/f$c;->b:I

    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method
