.class final Lj3/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lj3/c$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Li3/b;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lj3/b;->n:Lj3/b;

    sput-object v0, Lj3/c$a;->c:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;FIIFIFZII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li3/b$b;

    invoke-direct {v0}, Li3/b$b;-><init>()V

    invoke-virtual {v0, p1}, Li3/b$b;->o(Ljava/lang/CharSequence;)Li3/b$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Li3/b$b;->p(Landroid/text/Layout$Alignment;)Li3/b$b;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Li3/b$b;->h(FI)Li3/b$b;

    move-result-object p1

    invoke-virtual {p1, p5}, Li3/b$b;->i(I)Li3/b$b;

    move-result-object p1

    invoke-virtual {p1, p6}, Li3/b$b;->k(F)Li3/b$b;

    move-result-object p1

    invoke-virtual {p1, p7}, Li3/b$b;->l(I)Li3/b$b;

    move-result-object p1

    invoke-virtual {p1, p8}, Li3/b$b;->n(F)Li3/b$b;

    move-result-object p1

    if-eqz p9, :cond_0

    invoke-virtual {p1, p10}, Li3/b$b;->s(I)Li3/b$b;

    :cond_0
    invoke-virtual {p1}, Li3/b$b;->a()Li3/b;

    move-result-object p1

    iput-object p1, p0, Lj3/c$a;->a:Li3/b;

    iput p11, p0, Lj3/c$a;->b:I

    return-void
.end method

.method public static synthetic a(Lj3/c$a;Lj3/c$a;)I
    .locals 0

    invoke-static {p0, p1}, Lj3/c$a;->c(Lj3/c$a;Lj3/c$a;)I

    move-result p0

    return p0
.end method

.method static synthetic b()Ljava/util/Comparator;
    .locals 1

    sget-object v0, Lj3/c$a;->c:Ljava/util/Comparator;

    return-object v0
.end method

.method private static synthetic c(Lj3/c$a;Lj3/c$a;)I
    .locals 0

    iget p1, p1, Lj3/c$a;->b:I

    iget p0, p0, Lj3/c$a;->b:I

    invoke-static {p1, p0}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method
